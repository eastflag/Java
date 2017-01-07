package $12.$3.$7.$2;

/**
친절한 비디오 가게 아저씨 메카니즘을 적용한 세마포어의 구현
고객들은 순서대로 기다리지만 깨어날때는 순서대로 깨어나는게 아니라 우선순위가 높은 쓰레드가 먼저깸.
하지만 어떤 쓰레드가 깰지는 내부 알고리즘으로 알수가 없다.
즉 어떤 쓰레드가 깨어날지 완벽히 알수 없음.
그러므로, 몽땅 깨우는 notifyAll()을 사용한다.
**/
import java.util.*;
class VideoShop{
	private ArrayList<String> buffer = new ArrayList<String>(); //@진 
	public VideoShop(){
		buffer.add("은하철도999-0");
		buffer.add("은하철도999-1");
	}
	public synchronized String lendVideo() throws InterruptedException{ //@1 synchronized
		Thread t = Thread.currentThread();
		if(buffer.size()==0){ //@1 if(buffer.size()==0)
			System.out.println(t.getName() + ": 대기 상태 진입");
			this.wait(); //@진 
			System.out.println(t.getName() + ": 대기 상태 해제");
		}
		String v = this.buffer.remove(buffer.size()-1);
		return v;
	}
	public synchronized void returnVideo(String video){ //@1 synchronized
		this.buffer.add(video);
		this.notify(); //@진 
	}
} 

class Person extends Thread{
	public void run(){
		try{
			String v = GoodVideoStoreKeeperMain.vShop.lendVideo(); //@진
			System.out.println(this.getName() + ":" + v  + " 대여");
			System.out.println(this.getName() + ":" + v  + " 보는중\n");
			this.sleep(1000); //@진 
			System.out.println(this.getName() + ":" + v  + " 반납");
			GoodVideoStoreKeeperMain.vShop.returnVideo(v); //@진
		}catch(InterruptedException e){e.printStackTrace();}
	} 
} 

public class GoodVideoStoreKeeperMain{
	public static VideoShop vShop = new VideoShop();
	public static void main(String[] args){
		System.out.println("프로그램 시작");
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		Person p6 = new Person();
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		System.out.println("프로그램 종료");
	} 
} 
/***
c:\javasrc\chap10>javac GoodVideoStoreKeeperMain.java
c:\javasrc\chap10>java GoodVideoStoreKeeperMain
프로그램 시작
프로그램 종료
Thread-0:은하철도999-1 대여
Thread-0:은하철도999-1 보는중

Thread-1:은하철도999-0 대여
Thread-1:은하철도999-0 보는중

Thread-2: 대기 상태 진입
Thread-3: 대기 상태 진입
Thread-4: 대기 상태 진입
Thread-5: 대기 상태 진입
Thread-0:은하철도999-1 반납
Thread-2: 대기 상태 해제
Thread-2:은하철도999-1 대여
Thread-2:은하철도999-1 보는중

Thread-1:은하철도999-0 반납
Thread-3: 대기 상태 해제
Thread-3:은하철도999-0 대여
Thread-3:은하철도999-0 보는중

Thread-2:은하철도999-1 반납
Thread-4: 대기 상태 해제
Thread-4:은하철도999-1 대여
Thread-4:은하철도999-1 보는중

Thread-3:은하철도999-0 반납
Thread-5: 대기 상태 해제
Thread-5:은하철도999-0 대여
Thread-5:은하철도999-0 보는중

Thread-4:은하철도999-1 반납
Thread-5:은하철도999-0 반납
***/