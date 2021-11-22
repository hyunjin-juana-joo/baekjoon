package com.baekjoon.test.level5.problem10818;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * https://www.acmicpc.net/problem/10818
     * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int list[] = new int[number];

        for (int i=0; i<number; i++) {
            list[i] = scanner.nextInt();
        }

        scanner.close();

        int min = Arrays.stream(list).min().getAsInt();
        int max = Arrays.stream(list).max().getAsInt();
        System.out.println(min + " " + max);
    }
}