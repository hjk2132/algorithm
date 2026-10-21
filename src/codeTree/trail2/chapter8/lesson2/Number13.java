package codeTree.trail2.chapter8.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-difference-between-maximum-and-minimum/submissions
public class Number13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= 10000; ++i) {
            int a = i;
            int b = a + k;
            int sum = 0;

            for (int j = 0; j < n; ++j) {
                if (arr[j] < a) {
                    sum = sum + Math.abs(a - arr[j]);
                } else if (arr[j] > b) {
                    sum = sum + Math.abs(b - arr[j]);
                }
            }

            if (sum < answer) {
                answer = sum;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
