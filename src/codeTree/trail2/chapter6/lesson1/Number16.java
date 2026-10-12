package codeTree.trail2.chapter6.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-sum-close-to-particular-number/submissions
public class Number16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        int total = 0;

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
            total = total + arr[i];
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int temp = total - arr[i] - arr[j];
                int diff = (int) Math.abs(s - temp);

                if (diff < min) {
                    min = diff;
                }
            }
        }

        System.out.println(min);
        sc.close();
    }
}
