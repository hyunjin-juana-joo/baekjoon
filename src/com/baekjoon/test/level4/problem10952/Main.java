
package com.baekjoon.test.level4.problem10952;

import java.util.Scanner;

public class Main {

    /**
     * https://www.acmicpc.net/problem/10952
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
     * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
     * 입력의 마지막에는 0 두 개가 들어온다.
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a <= 0 && b <= 0) {
                scanner.close();
                break;
            }
            System.out.println(a + b);
        }
    }
}