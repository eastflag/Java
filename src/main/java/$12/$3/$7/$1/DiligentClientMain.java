package $12.$3.$7.$1;


/**
부지런한 고객 메카니즘을 적용한 세마포어
반납된 비디오가 있는지를 고객이 계속 확인하는 메커니즘.
**/
import java.util.*;
class VideoShop{
	private ArrayList<String> buffer = new ArrayList<String>(); //@진 
	public VideoShop(){
		buffer.add("은하철도999-0");
		buffer.add("은하철도999-1");
		buffer.add("은하철도999-2");
	}
	public synchronized String lendVideo(){ //@1 synchronized
		if(buffer.size()>0){ //@1 if(buffer.size()>0)
			String v = (String)this.buffer.remove(buffer.size()-1);
			return v;
		}else{
			return null; //@진 
		}
	}
	public synchronized void returnVideo(String video){ //@1 synchronized
		this.buffer.add(video);
	}
} 

class Person extends Thread{ //@1 extends Thread
	public void run(){ //@1 public void run()
		try{
			String v;
			while((v = DiligentClientMain.vShop.lendVideo()) == null ){ //@1 DiligentClientMain.vShop.lendVideo()
				System.out.println(this.getName() + "비디오가 없군요! 나중에 와야지!");
				this.sleep(200);
			}
			System.out.println(this.getName() + ":" + v  + " 대여");
			System.out.println(this.getName() + ":" + v  + " 보는중");
			this.sleep(5000);
			System.out.println(this.getName() + ":" + v  + " 반납");
			DiligentClientMain.vShop.returnVideo(v); //@1 DiligentClientMain.vShop.returnVideo(v)
		}catch(InterruptedException e){e.printStackTrace();}
	}
} 

public class DiligentClientMain{
	public static VideoShop vShop = new VideoShop();
	public static void main(String[] args){
		System.out.println("프로그램 시작");
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		System.out.println("프로그램 종료");
	} 
} 
/***
c:\javasrc\chap10>javac DiligentClientMain.java
c:\javasrc\chap10>java DiligentClientMain
프로그램 시작
프로그램 종료
Thread-0:은하철도999-2 대여
Thread-0:은하철도999-2 보는중
Thread-1:은하철도999-1 대여
Thread-1:은하철도999-1 보는중
Thread-2:은하철도999-0 대여
Thread-2:은하철도999-0 보는중
Thread-3비디오가 없군요! 나중에 와야지!
Thread-3비디오가 없군요! 나중에 와야지!
Thread-3비디오가 없군요! 나중에 와야지!
         .........
         중간 생략
         .........
Thread-3비디오가 없군요! 나중에 와야지!
Thread-3비디오가 없군요! 나중에 와야지!
Thread-3비디오가 없군요! 나중에 와야지!
Thread-0:은하철도999-2 반납
Thread-1:은하철도999-1 반납
Thread-2:은하철도999-0 반납
Thread-3:은하철도999-0 대여
Thread-3:은하철도999-0 보는중
Thread-3:은하철도999-0 반납
***/