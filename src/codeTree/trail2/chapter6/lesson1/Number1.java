package codeTree.trail2.chapter6.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-gather/submissions
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; ++i) {
            int sum = 0;

            for (int j = 0; j < n; ++j) {
                if (j != i) {
                    sum = sum + arr[j] * Math.abs(i - j);
                }
            }

            if (min > sum) {
                min = sum;
            }
        }

        System.out.println(min);
        sc.close();
    }
}
