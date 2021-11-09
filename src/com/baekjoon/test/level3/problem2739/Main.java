package com.baekjoon.test.level3.problem2739;

import java.util.Scanner;

public class Main {

    /**
     * https://www.acmicpc.net/problem/2739
     * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
     */
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        for (int i=1; i<=9; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }

}