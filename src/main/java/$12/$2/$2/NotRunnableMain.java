package $12.$2.$2;


public class NotRunnableMain{
	public static void main(String[] args){
		long current = System.currentTimeMillis(); //@진 
		System.out.println("프로그램 시작");
		try{
			Thread.sleep(5000); //@진 
		}catch(InterruptedException e){e.printStackTrace();}
		System.out.println("프로그램 종료");
		System.out.println("시간: " + (System.currentTimeMillis()-current)); //@1 System.currentTimeMillis()-current
	} 
} 
