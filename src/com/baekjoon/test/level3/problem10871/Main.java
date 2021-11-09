package com.baekjoon.test.level3.problem10871;

import java.util.Scanner;

public class Main {

    /**
     * https://www.acmicpc.net/problem/10871
     * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
     */
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        int progression[] = new int[n];

        for(int i = 0; i < n; i++) {
            progression[i] = scanner.nextInt();
        }

        scanner.close();

        for (int i = 0; i < n; i++) {
            if (progression[i] < x) {
                System.out.print(progression[i] + " ");
            }
        }
    }
}