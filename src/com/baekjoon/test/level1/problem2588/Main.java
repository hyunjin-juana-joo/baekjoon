package com.baekjoon.test.level1.problem2588;

import java.util.Scanner;

public class Main {

    /**
     * https://www.acmicpc.net/problem/2588
     * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
     * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
     * 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
     * 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
     */
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String b = scanner.next();
        System.out.println(a * Integer.parseInt(String.valueOf(b.charAt(2))));
        System.out.println(a * Integer.parseInt(String.valueOf(b.charAt(1))));
        System.out.println(a * Integer.parseInt(String.valueOf(b.charAt(0))));
        System.out.println(a * Integer.parseInt(b));
    }

}