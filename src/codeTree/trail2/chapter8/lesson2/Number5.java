package codeTree.trail2.chapter8.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-great-jump/submissions
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < n; ++i) {
            list[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        dp[0] = list[0];

        for (int i = 1; i < n; ++i) {
            int min = Integer.MAX_VALUE;

            for (int j = Math.max(0, i - k); j < i; ++j) {
                min = Math.min(min, dp[j]);
            }

            dp[i] = Math.max(list[i], min);
        }

        System.out.println(dp[n-1]);
        sc.close();
    }
}
