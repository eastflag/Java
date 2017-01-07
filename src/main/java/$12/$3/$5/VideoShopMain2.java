package $12.$3.$5;

/**
데이터를 집어넣고 추출할 때에만 동기화를 보장
비디오를 보는중에는 동기화를 걸지 않았다.
그래서 다섯번째 비디오를 빌리게 되면 에러 발생
**/
import java.util.*;
class VideoShop{
	private ArrayList<String> buffer = new ArrayList<String>();
	public VideoShop(){
		buffer.add("은하철도999-0");
		buffer.add("은하철도999-1");
		buffer.add("은하철도999-2");
		buffer.add("은하철도999-3");
	}
	public synchronized String lendVideo(){ //@1 public synchronized String lendVideo()
		String v = (String)this.buffer.remove(buffer.size()-1);
		return v;
	}
	public synchronized void returnVideo(String video){ //@1 public synchronized void returnVideo(String video)
		this.buffer.add(video);
	}
} 

class Person extends Thread{
	public void run(){
		try{
			String v = VideoShopMain2.vShop.lendVideo(); //@진 
			System.out.println(this.getName() + ":" + v  + " 대여");
			System.out.println(this.getName() + ":" + v  + " 보는중");
			this.sleep(5000);
			System.out.println(this.getName() + ":" + v  + " 반납");
			VideoShopMain2.vShop.returnVideo(v); //@진 
		}catch(InterruptedException e){e.printStackTrace();}
	}
} 

class VideoShopMain2{
	public static VideoShop vShop = new VideoShop();
	public static void main(String[] args){
		System.out.println("프로그램 시작");
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		//오류 발생
		//Person p5 = new Person();
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		//p5.start();
		System.out.println("프로그램 종료");
	} 
} 
/***
c:\javasrc\chap08>javac VideoShopMain2.java
c:\javasrc\chap08>java VideoShopMain2
프로그램 시작
프로그램 종료
Thread-1:은하철도999-3 대여
Thread-2:은하철도999-2 대여
Thread-3:은하철도999-1 대여
Thread-4:은하철도999-0 대여
Thread-1:은하철도999-3 보는중
Thread-2:은하철도999-2 보는중
Thread-3:은하철도999-1 보는중
Thread-4:은하철도999-0 보는중
Thread-1:은하철도999-3 반납
Thread-2:은하철도999-2 반납
Thread-3:은하철도999-1 반납
Thread-4:은하철도999-0 반납
***/