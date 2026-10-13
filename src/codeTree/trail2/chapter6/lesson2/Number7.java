package codeTree.trail2.chapter6.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-equalizing-the-height-of-the-field/submissions
public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int t = sc.nextInt();
        int[] cost = new int[n];

        // 각 칸의 높이 차를 계산
        for (int i = 0; i < n; ++i) {
            int height = sc.nextInt();
            cost[i] = Math.abs(h - height);
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n - t + 1; ++i) {
            int sum = 0;

            for (int j = i; j < i + t; ++j) {
                sum = sum + cost[j];
            }

            if (sum < min) {
                min = sum;
            }
        }

        System.out.println(min);
        sc.close();
    }
}
