package com.baekjoon.test.level1.problem1001;

import java.util.Scanner;

public class Main {

    /**
     * https://www.acmicpc.net/problem/1001
     * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
     * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
     */
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a - b);
    }

}