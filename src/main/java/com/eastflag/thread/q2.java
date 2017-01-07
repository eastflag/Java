package com.eastflag.thread;

public class q2 {
	public static final String HELLO = "hello";
	
	public static void main(String[] args) {
		
		//4. Thread를 상속하지 말고, Thread(Runnable r)을 사용하여 구현하여 보시오.
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<HELLO.length(); ++i) {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.print(HELLO.substring(i, i+1));
				}
			}
		}).start();
		
		System.out.print("finish");
	}
}