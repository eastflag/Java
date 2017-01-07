package com.eastflag.anonymous;

import com.eastflag.listener.ClickListener;

public class q1 {

	public static void main(String[] args) {
		//이너클래스는 outer 클래스의 인스턴스가 먼저 생성되어야 접근 가능하다.
		MyClick innerInstance = new MyClick();
		innerInstance.onClick();
	}

}

class MyClick implements ClickListener {

	@Override
	public void onClick() {
		System.out.println("clicked");
	}
	
}