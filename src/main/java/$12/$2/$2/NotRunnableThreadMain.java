package $12.$2.$2;


import java.util.*;
class NotRunnableThread extends Thread {
	public void run() {
		int i = 0;
		while(i < 5) {
			System.out.println(i + "회:" + System.currentTimeMillis() + "\t"); //@1 System.currentTimeMillis()
			i = i + 1;
			try{
				this.sleep(1000); //@진 
			}catch(Exception e){System.out.println(e);}
		}
	}
} 

public class NotRunnableThreadMain {
   public static void main(String args[] ) {
	   NotRunnableThread s = new NotRunnableThread();
	   s.start();
   } 
}
