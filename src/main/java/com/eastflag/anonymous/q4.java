package com.eastflag.anonymous;

import com.eastflag.listener.ClickListener;

public class q4 {

	public static void main(String[] args) {
		ClickListener a = () -> {
			System.out.printf("q4 Clicked");
        };
        a.onClick();
	}

}
