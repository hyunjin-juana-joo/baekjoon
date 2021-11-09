package com.baekjoon.test.level3.problem2742;

import java.util.Scanner;

public class Main {

    /**
     * https://www.acmicpc.net/problem/2742
     * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
     */
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i=n; i>=1; i--) {
            System.out.println(i);
        }

    }
}