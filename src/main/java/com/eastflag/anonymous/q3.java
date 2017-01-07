package com.eastflag.anonymous;

import com.eastflag.listener.ClickListener;

public class q3 {
    public static void main(String[] args) {
    	ClickListener a = new ClickListener() {
            @Override
            public void onClick() {
                System.out.printf("q3 Clicked");
            }
        };
        
        setClickListener(a);
    }

    public static void setClickListener(ClickListener l) {
        l.onClick();
    }

}

/*
Q1) 위 q2번의 코드를 작성후 컴파일하면 .class 화일이 두개가 생성된다. 각각 무엇인가?
    MyClick.class
    MyClick$1.class ...
Q2) q2번에서 생성된 .class 화일을 볼때 익명클래스란 이름은 어디서 유래가 된것일까?
    이름이 없는 클래스
Q3) q3번에서 추가한 함수의 파라메터 타입이 인터페이스이다. 인터페이스는 추상화된 타입이라 객체를 만들수없는데,
함수의 파라메터 타입이 인터페이스라는것은 무엇을 넣으라는 것인가?
    인터페이스를 구현한 인스턴스를 넣어야한다는것
Q4) 익명클래스는 인스턴스인가? 클래스인가?
    인스턴스이다.
Q5) q3번에서 추가한 함수앞에 static이 붙어있다. 이 static을 제거하면 에러가 발생하는데, 왜 에러가 발생하는가?
    static 안에는 non static이 올수없다.
    */

