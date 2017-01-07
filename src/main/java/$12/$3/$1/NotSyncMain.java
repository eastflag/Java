package $12.$3.$1;
/**
동기화의 문제 발생
**/
class Bank{ //@1 class Bank
	private int money = 10000; //예금 잔액
	public int getMoney(){ //@1 getMoney()
		return this.money;
	}
	public void setMoney(int money){ //@1 setMoney(int money)
		this.money = money;
	}
	public void saveMoney(int save){ //@1 saveMoney(int save)
		int m = this.getMoney();
		try{
			Thread.sleep(3000); //@진 
		}catch(InterruptedException e){e.printStackTrace();}
		this.setMoney(m + save);
	}
	public void minusMoney(int minus){ //@1 minusMoney(int minus)
		int m = this.money;
		try{
			Thread.sleep(200); //@진 
		}catch(InterruptedException e){e.printStackTrace();}
		this.setMoney(m - minus);
	}
} 

class Park extends Thread{ //@1 class Park extends Thread
	public void run(){
		NotSyncMain.myBank.saveMoney(3000);  //@진 
		System.out.println("saveMoney(3000):" + NotSyncMain.myBank.getMoney());
	}
} 

class ParkWife extends Thread{ //@1 class ParkWife extends Thread
	public void run(){
		NotSyncMain.myBank.minusMoney(1000);  //@진 
		System.out.println("minusMoney(1000):" + NotSyncMain.myBank.getMoney());
	}
} 

public class NotSyncMain{
	public static Bank myBank = new Bank();
	public static void main(String[] args) throws Exception{
		System.out.println("원금:" + myBank.getMoney());
		Park p = new Park();
		ParkWife w = new ParkWife();
		p.start(); //@진 
		try{
			Thread.sleep(200);
		}catch(InterruptedException e){e.printStackTrace();}
		w.start(); //@진 
	} 
} 
/***
c:\javasrc\chap08>javac NotSyncMain.java
c:\javasrc\chap08>java NotSyncMain
원금:10000
minusMoney(1000):9000
saveMoney(3000):13000
***/