package com.eastflag.thread;

public class q1 {
	public static final String HELLO = "hello";
	
	public static void main(String[] args) {
		// 2. 쓰레드 시작
		MyThread thread = new MyThread();
		thread.start();
		
		System.out.print("finish");
	}
}

//1. Thread를 상속한 클래스를 생성후 
//   0.3초 간격으로 hello를 프린트하는 로직 작성
class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<q1.HELLO.length(); ++i) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(q1.HELLO.substring(i, i+1));
		}
	}
}