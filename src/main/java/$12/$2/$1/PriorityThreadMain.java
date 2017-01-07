package $12.$2.$1;

//12일차 2.2 쓰레드의 우선권 테스트 예제
/**
스레드의 우선권을 테스트하는 예제
**/
class PriorityThread extends Thread {                        
	public void run() {
		long startTime = System.currentTimeMillis();
		for(int i=0; i<100; i++){
			for(int j=0; j<1000000000; j++){
			}
		}
		System.out.println(this.getName()+" [우선권:" + this.getPriority() + "쓰레드소요시간:" + (System.currentTimeMillis() - startTime) ); //@1 this.getName() //@1 this.getPriority()
	}
} 

public class PriorityThreadMain {
   public static void main(String[] args) {
		System.out.println("Main메서드 시작");
		PriorityThread[] p = new PriorityThread[10]; //10개 배열 생성 
		for(int i=0; i<10; i++){
		//for(int i=Thread.MIN_PRIORITY; i<=Thread.MAX_PRIORITY; i++){
			p[i] = new PriorityThread(); //@진 
			p[i].setPriority(i+1); //@진 
			p[i].setName("Thread-"+(i+1)); //@진 
		}
		for(int i=0; i<10; i++){
			p[i].start(); //@진 
		}
		
		System.out.println("Main메서드종료");
   }
} 