package $12.$3.$3;
/**
synchronized 블럭을 동기화 예제(또다른 방법)
**/
class Bank{ //@1 class Bank
	private int money = 10000; //예금 잔액
	public int getMoney(){
		return this.money;
	}
	public void setMoney(int money){
		this.money = money;
	}
	public void saveMoney(int save){
		int m = this.getMoney();
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){e.printStackTrace();}
		this.setMoney(m + save);
	}
	public void minusMoney(int minus){
		int m = this.money;
		try{
			Thread.sleep(200);
		}catch(InterruptedException e){e.printStackTrace();}
		this.setMoney(m - minus);
	}
} 

class Park extends Thread{ //@1 class Park extends Thread
	public void run(){
		synchronized(SyncMain2.myBank){ //@1 synchronized(SyncMain2.myBank)
			SyncMain2.myBank.saveMoney(3000); //@진  
		}
		System.out.println("saveMoney(3000):" + SyncMain2.myBank.getMoney());
		
	}
} 

class ParkWife extends Thread{ //@1 class ParkWife extends Thread
	public void run(){
		synchronized(SyncMain2.myBank){ //@1 synchronized(SyncMain2.myBank)
			SyncMain2.myBank.minusMoney(1000); //@진 
		}
		System.out.println("minusMoney(3000):" + SyncMain2.myBank.getMoney());
	}
} 

public class SyncMain2{
	public static Bank myBank = new Bank();
	public static void main(String[] args) throws Exception{
		System.out.println("원금:" + myBank.getMoney());
		Park p = new Park(); //@진 
		ParkWife w = new ParkWife(); //@진 
		p.start(); //@진 
		try{
			Thread.sleep(200);
		}catch(InterruptedException e){e.printStackTrace();}
		w.start(); //@진 
	} 
} 
/***
c:\javasrc\chap08>javac SyncMain2.java
c:\javasrc\chap08>java SyncMain2
원금:10000
saveMoney(3000):13000
minusMoney(3000):12000
***/