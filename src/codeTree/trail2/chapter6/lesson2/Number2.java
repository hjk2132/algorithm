package codeTree.trail2.chapter6.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-G-or-H-3/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[25000];

        for (int i = 0; i < n; ++i) {
            int index = sc.nextInt();
            String str = sc.next();

            if (str.equals("G")) {
                arr[index] = 1;
            } else {
                arr[index] = 2;
            }
        }

        int max = 0;

        for (int i = 1; i <= 10000; ++i) {
            int sum = 0;
            for (int j = i; j <= i + k; ++j) {
                sum += arr[j];
            }

            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
        sc.close();
    }
}
