package codeTree.trail2.chapter8.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-maximum-sum-of-element-values/submissions
public class Number8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] list = new int[n + 1];

        for (int i = 1; i <= n; ++i) {
            list[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 1; i <= n; ++i) {
            int sum = 0;
            int current = i;

            for (int j = 0; j < m; ++j) {
                sum = sum + list[current];
                current = list[current];
            }

            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
        sc.close();
    }
}
