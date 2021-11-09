package com.baekjoon.test.level3.problem11021;

import java.util.Scanner;

public class Main {

    /**
     * https://www.acmicpc.net/problem/11021
     * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
     */
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println("Case #" + i + ": " + (b + c));
        }

        scanner.close();
    }
}