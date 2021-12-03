package com.baekjoon.test.level6.problem1065;

import java.util.Scanner;

public class Main {

    /**
     * https://www.acmicpc.net/problem/1065
     * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
     * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
     * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
     * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
     * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(arithmetical_progression(number));
    }

    private static int arithmetical_progression(int number) {
        int MAX_NUMBER = 1000;
        if (number > MAX_NUMBER) {
            return MAX_NUMBER;
        }

        if (number < 100) {
            return number;
        }

        int result = 99;
        for (int i=100; i<=number; i++) {
            int hundred = i / 100,
                ten = (i/10) % 10,
                one = i % 10;

            if ((hundred - ten) == (ten - one)) {
                result++;
            }
        }

        return result;
    }
}