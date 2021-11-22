package com.baekjoon.test.level5.problem3052;

import java.util.Scanner;

public class Main {

    /**
     * https://www.acmicpc.net/problem/2562
     * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지이다.
     * 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
     * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
     * 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        final int inputCount = 10;
        final int pivotNumber = 42;

        int[] list = new int[inputCount];
        int[] leaves = new int[inputCount];
        int result = 0;

        for (int i=0; i<inputCount; i++) {
            list[i] = scanner.nextInt();
            leaves[i] = list[i] % pivotNumber;

            boolean isExist = false;
            for (int j=0; j<i; j++) {
                if (leaves[j] == leaves[i]) {
                    isExist = true;
                    break;
                }
            }

            if (!isExist) {
                result++;
            }
        }

        System.out.println(result);
    }
}