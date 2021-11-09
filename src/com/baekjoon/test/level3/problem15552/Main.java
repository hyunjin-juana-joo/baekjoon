package com.baekjoon.test.level3.problem15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    /**
     * https://www.acmicpc.net/problem/15552
     * 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다.
     * 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
     * Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
     * BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
     * 또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다.
     * 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
     * 자세한 설명 및 다른 언어의 경우는 이 글에 설명되어 있다.
     * 이 블로그 글에서 BOJ의 기타 여러 가지 팁을 볼 수 있다.
     */
    public static void main(String args[]){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int a = Integer.parseInt(bufferedReader.readLine());

            for (int i = 0; i < a; i++) {
                String[] line = bufferedReader.readLine().split(" ");

                int b = Integer.parseInt(line[0]);
                int c = Integer.parseInt(line[1]);

                bufferedWriter.write(b + c + "\n");
            }

            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}