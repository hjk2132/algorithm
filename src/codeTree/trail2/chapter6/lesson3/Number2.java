package codeTree.trail2.chapter6.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-ability-of-developer-3/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int sum = 0;

        for (int i = 0; i < 6; ++i) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 6; ++i) {
            for (int j = i + 1; j < 6; ++j) {
                for (int k = j + 1; k < 6; ++k) {
                    int teamA = arr[i] + arr[j] + arr[k];
                    int teamB = sum - teamA;
                    int diff = Math.abs(teamA - teamB);

                    if (diff < min) {
                        min = diff;
                    }
                }
            }
        }

        System.out.println(min);
        sc.close();
    }
}
