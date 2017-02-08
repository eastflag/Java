package com.eastflag.q;

import java.util.stream.IntStream;

/**
 * 1-10000 사이에 8자가 들어간 갯수를 모두 세시오.
 */
public class q1 {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 10000).map(i -> String.valueOf(i).length() - String.valueOf(i).replace("8", "")
                .length()).sum();
        System.out.println(sum);
    }
}
