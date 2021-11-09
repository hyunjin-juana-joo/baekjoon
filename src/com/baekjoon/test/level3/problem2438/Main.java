package com.baekjoon.test.level3.problem2438;

import java.util.Scanner;

public class Main {

    /**
     * https://www.acmicpc.net/problem/2438
     * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
     */
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}