package $12.$2.$1;
//12일차 1.7 쓰레드의 우선순위 예제
//main은 기본적으로 우선순위가 5이므로 main에서 쓰레드 생성하면 우선순위가 5
//쓰레드를 실행전에 우선순위 변경 가능.
class ThreadEx9 {
	public static void main(String args[]) {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		ThreadEx9_2 th2 = new ThreadEx9_2();

		th2.setPriority(7);

		System.out.println("Priority of th1(-) : " + th1.getPriority() );
		System.out.println("Priority of th2(|) : " + th2.getPriority() );
		th1.start();
		th2.start();
	}
}

class ThreadEx9_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("-");
			for(int x=0; x < 10000000; x++);
		}
	}
}

class ThreadEx9_2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("|");
			for(int x=0; x < 10000000; x++);
		}
	}
}