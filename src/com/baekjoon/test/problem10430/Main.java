package com.baekjoon.test.problem10430;

import java.util.Scanner;

public class Main {

    /**
     * https://www.acmicpc.net/problem/10430
     * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
     * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
     * 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
     * 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
     */
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }

}