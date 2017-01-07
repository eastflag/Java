package $12.$3.$4;
/**
잘못된 동기화의 예
4개의 비디오가 있지만, 단 하나의 비디오만 빌려주는 잘못된 예
**/
import java.util.*;
class VideoShop{ //@1 class VideoShop
	private ArrayList<String> buffer = new ArrayList<String>(); //@진 
	public VideoShop(){
		buffer.add("은하철도999-0");
		buffer.add("은하철도999-1");
		buffer.add("은하철도999-2");
		buffer.add("은하철도999-3");
	}
	public String lendVideo(){
		String v = (String)this.buffer.remove(buffer.size()-1); //@진 
		return v;
	}
	public void returnVideo(String video){
		this.buffer.add(video); //@진 
	}
} 

class Person extends Thread{
	public void run(){
		synchronized(VideoShopMain.vShop){ //@진 
			//5초동안 VideoShopMain.vShop은 락(Lock)에 걸리게 된다. //@진 
			try{
				String v = VideoShopMain.vShop.lendVideo(); //@진 
				System.out.println(this.getName() + ":" + v  + " 대여");
				System.out.println(this.getName() + ":" + v  + " 보는중");
				this.sleep(5000);
				System.out.println(this.getName() + ":" + v  + " 반납");
				VideoShopMain.vShop.returnVideo(v); //@진 
			}catch(InterruptedException e){e.printStackTrace();}
		} //@진 
	}
} 

class VideoShopMain{
	public static VideoShop vShop = new VideoShop(); //@진 
	public static void main(String[] args){
		System.out.println("프로그램 시작");
		Person p1 = new Person(); //@진 
		Person p2 = new Person(); //@진 
		Person p3 = new Person(); //@진 
		Person p4 = new Person(); //@진 
		p1.start(); //@진 
		p2.start(); //@진 
		p3.start(); //@진 
		p4.start(); //@진 
		System.out.println("프로그램 종료");
	}
} 
/***
c:\javasrc\chap08>javac VideoShopMain.java
c:\javasrc\chap08>java VideoShopMain
프로그램 시작
프로그램 종료
Thread-1:은하철도999-3 대여
Thread-1:은하철도999-3 보는중
Thread-1:은하철도999-3 반납
Thread-2:은하철도999-3 대여
Thread-2:은하철도999-3 보는중
Thread-2:은하철도999-3 반납
Thread-3:은하철도999-3 대여
Thread-3:은하철도999-3 보는중
Thread-3:은하철도999-3 반납
Thread-4:은하철도999-3 대여
Thread-4:은하철도999-3 보는중
Thread-4:은하철도999-3 반납
***/