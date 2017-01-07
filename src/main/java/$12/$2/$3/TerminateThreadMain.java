package $12.$2.$3;

import java.util.Scanner;

/**
while문의 조건을 이용한 스레드의 종료를 테스트하는 예
**/
class TerminateThread extends Thread {
	//스레드의 종료를 제어하는 플래그
	private boolean flag = false; //@진 
	public void run() {
		int count = 0;
		System.out.println(this.getName() +"시작");
		while(!flag) { //@1 !flag
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

public class TerminateThreadMain {
	public static void main(String args[])throws Exception{
		System.out.println("작업시작");
		TerminateThread a = new TerminateThread(); //@진 
		TerminateThread b = new TerminateThread(); //@진 
		TerminateThread c = new TerminateThread(); //@진 
		a.start(); //@진 
		b.start(); //@진 
		c.start(); //@진 
		int i;
		System.out.print("종료할 스레드를 입력하시오! A, B, C, M?\n");
		while(true){
			//i = System.in.read();
			Scanner keyboard = new Scanner(System.in);
			String input = keyboard.nextLine();
			if(input.startsWith("A")){
				a.setFlag(true); //@진 
			}else if(input.startsWith("B")){
				b.setFlag(true); //@진 
			}else if(input.startsWith("C")){
				c.setFlag(true); //@진 
			}else if(input.startsWith("M")){
				a.setFlag(true); //@진 
				b.setFlag(true); //@진 
				c.setFlag(true); //@진 
				System.out.println("main종료");
				break;
			}
		}
	} 
} 
