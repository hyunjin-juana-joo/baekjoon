
package com.baekjoon.test.level4.problem10951;

import java.util.Scanner;

public class Main {

    /**
     * https://www.acmicpc.net/problem/10951
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }

        scanner.close();
    }
}