package $12.$3.$2;
/**
동기화가 보장 되는 스레드 예제
**/
class Data{
	public int i = 0; //@진 
}

class Tom extends Thread{
	public void run(){
		for (int i=0;i<100000; i++){
			synchronized(SyncDataMain.data){ //@1 synchronized(SyncDataMain.data)
				SyncDataMain.data.i++; //@진 
			}
		}
		System.out.println("Tom :" + SyncDataMain.data.i);
	}
}

class Jane extends Thread{
	public void run(){
		for (int i=0;i<100000; i++){
			synchronized(SyncDataMain.data){ //@1 synchronized(SyncDataMain.data)
				SyncDataMain.data.i++; //@진 
			}
		}
		System.out.println("Jane:" + SyncDataMain.data.i);
	}
}

public class SyncDataMain{
	public static Data data = new Data(); //@진 

	public static void main(String[] args){
		System.out.println("동기화 보장 예제 시작");
		Tom t = new Tom();
		Jane j = new Jane();
		t.start();
		j.start();
		System.out.println("동기화 보장 예제 종료");
	}
}
/***
c:\javasrc\chap08> javac SyncDataMain.java
c:\javasrc\chap08> java SyncDataMain

동기화 보장 예제 시작
동기화 보장 예제 종료
Tom :195187
Jane:200000
***/