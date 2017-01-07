package $12.$1;
//12일차 1.5예제
//run을 호출하여 발생한 예외의 호출 스택이 main -> run ->throwException 임을 확인
class ThreadEx3 {
	public static void main(String args[]) throws Exception {
		MyThreadEx3_1 t1 = new MyThreadEx3_1();
		t1.run();
	}
}

class MyThreadEx3_1 extends Thread {
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