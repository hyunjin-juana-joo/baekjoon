package com.baekjoon.test.level5.problem4344;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /**
     * https://www.acmicpc.net/problem/4344
     * 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
     * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
     * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
     * 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<inputCount; i++) {
            String[] scoreStrArray = scanner.nextLine().split(" ");
            int scoreCount = Integer.parseInt(scoreStrArray[0]);
            int[] scoreArray = new int[scoreCount];

            for (int j=1; j<=scoreCount; j++) {
                scoreArray[j-1] = Integer.parseInt(scoreStrArray[j]);
            }

            double average = Arrays.stream(scoreArray).average().getAsDouble();
            double aboveAverageCount = Arrays.stream(scoreArray).filter(score -> score > average).count();
            float percent = (float) ((aboveAverageCount / scoreCount) * 100);

            System.out.println(String.format("%.3f%s", percent, "%"));
        }

        scanner.close();
    }
}