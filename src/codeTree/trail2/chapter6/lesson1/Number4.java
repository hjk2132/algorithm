package codeTree.trail2.chapter6.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-best-place-of-13/submissions
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int max = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - 2; ++j) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2];

                if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println(max);
        sc.close();
    }
}
