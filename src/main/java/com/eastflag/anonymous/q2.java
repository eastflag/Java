package com.eastflag.anonymous;

import com.eastflag.listener.ClickListener;

public class q2 {

    public static void main(String[] args) {
        ClickListener a = new ClickListener() {
            @Override
            public void onClick() {
                System.out.printf("q2 Clicked");
            }
        };
        a.onClick();
    }

}