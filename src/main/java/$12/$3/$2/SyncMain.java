package $12.$3.$2;

/**
synchronized를 이용한 동기화의 보장
**/
class Bank{ //@1 class Bank
	private int money = 10000; //예금 잔액
	public int getMoney(){
		return this.money;
	}
	public void setMoney(int money){
		this.money = money;
	}
	//다른 쓰레드가 이 메서드를 사용할려고하면 대기하게 됨.
	public synchronized void saveMoney(int save){ //@1 synchronized
		int m = this.getMoney();
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){e.printStackTrace();}
		this.setMoney(m + save);
	}
	public void minusMoney(int minus){
		//공유자원을 현재 객체로 한다는 의미
		synchronized(this){ //@진 
			int m = this.money;
			try{
				Thread.sleep(200);
			}catch(InterruptedException e){e.printStackTrace();}
			this.setMoney(m - minus);
		} //@진 
	}
} 

class Park extends Thread{ //@1 class Park extends Thread
	public void run(){
		SyncMain.myBank.saveMoney(3000); 
		System.out.println("saveMoney(3000):" + SyncMain.myBank.getMoney());
	}
} 

class ParkWife extends Thread{ //@1 class ParkWife extends Thread
	public void run(){
		SyncMain.myBank.minusMoney(1000); 
		System.out.println("minusMoney(3000):" + SyncMain.myBank.getMoney());
	}
} 

public class SyncMain{
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
c:\javasrc\chap08>javac SyncMain.java
c:\javasrc\chap08>java SyncMain
원금:10000
saveMoney(3000):13000
minusMoney(3000):12000
***/