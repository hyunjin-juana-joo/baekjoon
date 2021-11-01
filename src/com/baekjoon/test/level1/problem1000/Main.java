package com.baekjoon.test.level1.problem1000;

import java.util.Scanner;

public class Main {

    /**
     * https://www.acmicpc.net/problem/1000
     * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
     * 첫째 줄에 A+B를 출력한다.
     */
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }

}