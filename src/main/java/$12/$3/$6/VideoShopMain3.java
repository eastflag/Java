package $12.$3.$6;

/**
여유분이 있을 때만 비디오 테이프를 빌려주기
그러나 더이상 고객은 비디오를 빌리러 오지 않는 문제 발생
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
	public synchronized String lendVideo(){ //@1 synchronized
		if(buffer.size()>0){ //@1 buffer.size()>0
			String v = (String)this.buffer.remove(buffer.size()-1);
			return v;
		}else{
			return null;
		}
	}
	public synchronized void returnVideo(String video){ //@1 synchronized
		this.buffer.add(video);
	}
} 

class Person extends Thread{
	public void run(){
		String v = VideoShopMain3.vShop.lendVideo(); //@진 
		if( v == null){
			System.out.println(this.getName() + "비디오가 없군요. 안봅니다.");
			return;
		}
		try{
			System.out.println(this.getName() + ":" + v  + " 대여");
			System.out.println(this.getName() + ":" + v  + " 보는중\n");
			this.sleep(5000);
			System.out.println(this.getName() + ":" + v  + " 반납");
			VideoShopMain3.vShop.returnVideo(v); //@진 
		}catch(InterruptedException e){e.printStackTrace();}
	}
} 

public class VideoShopMain3{
	public static VideoShop vShop = new VideoShop();
	public static void main(String[] args){
		System.out.println("프로그램 시작");
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		System.out.println("프로그램 종료");
	} 
} 
/***
c:\javasrc\chap08>javac VideoShopMain3.java
c:\javasrc\chap08>java VideoShopMain3
프로그램 시작
프로그램 종료
Thread-1:은하철도999-3 대여
Thread-1:은하철도999-3 보는중

Thread-2:은하철도999-2 대여
Thread-2:은하철도999-2 보는중

Thread-3:은하철도999-1 대여
Thread-3:은하철도999-1 보는중

Thread-4:은하철도999-0 대여
Thread-4:은하철도999-0 보는중

Thread-5비디오가 없군요. 안봅니다.
Thread-1:은하철도999-3 반납
Thread-2:은하철도999-2 반납
Thread-3:은하철도999-1 반납
Thread-4:은하철도999-0 반납
***/