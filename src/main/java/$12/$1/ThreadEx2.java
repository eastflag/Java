package $12.$1;
//12일차 1.5 예제
//고의로 예외를 발생시켜서 스택구조가  첫번째 메서드가 main이 아니라 run인것을 확인

class ThreadEx2 {
	public static void main(String args[]) throws Exception {
		MyThreadEx2_1 t1 = new MyThreadEx2_1();
		t1.start();
	}
}

class MyThreadEx2_1 extends Thread {
	public void run() {
		throwException();
	}

	public void throwException() {
		try {
			throw new Exception();		
		} catch(Exception e) {
			e.printStackTrace();	
		}
	}
}