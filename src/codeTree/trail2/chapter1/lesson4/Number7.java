package codeTree.trail2.chapter1.lesson4;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-sum-of-specific-intervals/description
public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            int start = a1 - 1;
            int end = a2 - 1;
            int sum = 0;

            for (int j = start; j <= end; ++j) {
                sum = sum + arr[j];
            }

            System.out.println(sum);
        }
    }
}
