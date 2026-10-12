package codeTree.trail2.chapter6.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-max-sum-of-subarray/submissions
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < n - k + 1; ++i) {
            int sum = 0;

            for (int j = i; j < i + k; ++j) {
                sum = sum + arr[j];
            }

            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
        sc.close();
    }
}
