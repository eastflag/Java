package $12.$2.$3;

/**
두개의 조건을 이용한 스레드의 종료
M을 누르면 static 성질을 이용하여 모두 종료하게 한다.
**/
class ControlThread extends Thread {
	//모든 스레드의 종료를 제어하는 플래그
	public static boolean all_exit = false; //@진
	//스레드의 종료를 제어하는 플래그
	private boolean flag = false; //@진
	public void run() {
		int count = 0;
		System.out.println(this.getName() +"시작");
		//flag나 all_exit 둘 중 하나만 true이면 while문이 끝난다.
		while(!flag && !all_exit) { //@1 !flag && !all_exit
			try {
				//작업
				this.sleep(100);
			} catch(InterruptedException e) {  }
		}
		System.out.println(this.getName() +"종료");
	}
	public void setFlag(boolean flag){
		this.flag = flag;
	}
} 

public class ControlThreadMain {
	public static void main(String args[])throws Exception{
		System.out.println("작업시작");
		ControlThread a = new ControlThread(); //@진 
		ControlThread b = new ControlThread(); //@진 
		ControlThread c = new ControlThread(); //@진 
		a.start(); //@진 
		b.start(); //@진 
		c.start(); //@진 
		Thread.sleep(100);
		int i;
		System.out.print("종료할 스레드를 입력하시오! A, B, C, M?\n");
		while(true){
			i = System.in.read();
			if(i == 'A'){
				a.setFlag(true); //@진 
			}else if(i == 'B'){
				b.setFlag(true); //@진 
			}else if(i == 'C'){
				c.setFlag(true); //@진 
			}else if(i == 'M'){
				//모든 스레드를 종료시킨다.
				ControlThread.all_exit = true;
				System.out.println("main종료");
				break;
			}
		}
	} 
} 
/***
c:\javasrc\chap08>javac ControlThreadMain.java
c:\javasrc\chap08>java ControlThreadMain
작업시작
종료할 스레드를 입력하시오! A, B, C, M?
Thread-1시작
Thread-2시작
Thread-3시작
A
Thread-1종료
B
Thread-2종료
C
Thread-3종료
M
main종료

c:\javasrc\chap08>java ControlThreadMain
작업시작
종료할 스레드를 입력하시오! A, B, C, M?
Thread-1시작
Thread-2시작
Thread-3시작
M
main종료
Thread-1종료
Thread-2종료
Thread-3종료
***/
