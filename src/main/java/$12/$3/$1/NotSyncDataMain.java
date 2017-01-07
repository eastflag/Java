package $12.$3.$1;
/**
동기화가 보장 되지 않는 스레드 예제
**/
class Data{
	public int i = 0; //@진 
}

class Tom extends Thread{
	public void run(){
		for (int i=0; i<100000; i++){ //@1 i<100000
			NotSyncDataMain.data.i++; //@진  
		}
		System.out.println("Tom :" + NotSyncDataMain.data.i);
	}
}

class Jane extends Thread{
	public void run(){
		for (int i=0; i<100000; i++){ //@1 i<100000
			NotSyncDataMain.data.i++; //@진 
		}
		System.out.println("Jane:" + NotSyncDataMain.data.i);
	}
}

public class NotSyncDataMain{
	public static Data data = new Data();

	public static void main(String[] args){
		System.out.println("main 시작");
		Tom t = new Tom(); //@진 
		Jane j = new Jane(); //@진 
		t.start(); //@진 
		j.start(); //@진 
		System.out.println("main 종료");
	}
}
/***
c:\javasrc\chap08> javac NotSyncDataMain.java
c:\javasrc\chap08> java NotSyncDataMain

main 시작
main 종료
Tom :102508
Jane:188514
***/