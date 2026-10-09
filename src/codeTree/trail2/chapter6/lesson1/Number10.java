package codeTree.trail2.chapter6.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-two-non-adjacent-numbers/submissions
public class Number10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < n; ++i) {
            // System.out.println("====== i = " + i + " =======");

            int before = i - 1;
            int after = i + 1;
            // System.out.println("before, after = " + before + " " + after);

            for (int j = 0; j < n; ++j) {
                if (j != before && j != after && j != i) {
                    int sum = arr[i] + arr[j];

                    if (sum > max) {
                        max = sum;
                        // System.out.println ("i, j = " + i + " " + j + " / sum = " + sum);
                    }
                }
            }
        }

        System.out.println(max);
        sc.close();
    }
}
