package $12.$1;
//쓰레드를 생성하는 두가지 방법 12일차 1.4 예제
class ThreadEx1 {
	public static void main(String args[]) {
		//.1 쓰레드 생성하는 두가지 방법
		Thread1_1 t1 = new Thread1_1();
 
		Thread1_2 r = new Thread1_2();
		Thread t2 = new Thread(r);	  // 생성자 Thread(Runnable target)
		
		t1.start();
		t2.start();
		
		//2. Anonymous class
		Runnable r2 = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i < 5; i++) {
					// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
				    System.out.println(Thread.currentThread().getName());
				}
				
			}
		};
		
		Thread t3 = new Thread(r2);
		t3.start();
		
		//3. Anonymous Inner Type
		Thread t4 = new Thread (new Runnable() {
			@Override
			public void run() {
				for(int i=0; i < 5; i++) {
					// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
				    System.out.println(Thread.currentThread().getName());
				}
			}
		});
		t4.start();
		
	}
}

class Thread1_1 extends Thread {
	public void run() {
		for(int i=0; i < 5; i++) {
			System.out.println(getName()); // 조상인 Thread의 getName()을 호출
		}
	}
}

class Thread1_2 implements Runnable {
	public void run() {
		for(int i=0; i < 5; i++) {
			// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
		      System.out.println(Thread.currentThread().getName());
		}
	}
}