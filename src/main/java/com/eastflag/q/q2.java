package com.eastflag.q;

import java.util.stream.IntStream;

/**
 * 1-1000 사이에 3 또는 5의 배수의 갯수를 구하라
 */
public class q2 {
    public static void main(String[] args) {
        long sum = IntStream.rangeClosed(1, 20).filter(i -> i%3 == 0 || i%5 == 0).count();
        System.out.println(sum);
    }
}
