package codeTree.trail2.chapter8.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-multiply-two-and-remove-one-number/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = Integer.MAX_VALUE;
        int[] origin = new int[n];
        int[] copy = new int[n];

        for (int i = 0; i < n; ++i) {
            origin[i] = sc.nextInt();
        }

        for (int i = 0; i < n; ++i) {
            copy[i] = origin[i];
        }

        for (int i = 0; i < n; ++i) {
            int[] doubled = new int[n];

            for (int j = 0; j < n; ++j) {
                doubled[j] = copy[j];
            }

            doubled[i] = doubled[i] * 2;

            for (int j = 0; j < n; ++j) {
                int[] exception = new int[n-1];
                int index = 0;
                int sum = 0;

                for (int k = 0; k < n; ++k) {
                    if (k != j) {
                        exception[index] = doubled[k];
                        index = index + 1;
                    }
                }

                for (int k = 0; k < n - 2; ++k) {
                    sum = sum + Math.abs(exception[k] - exception[k+1]);
                }

                if (sum < answer) {
                    answer = sum;
                }
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
