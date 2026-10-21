package codeTree.trail2.chapter8.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-maximum-h-score-2/submissions
public class Number12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;

        for (int i = 0; i <= n; ++i) {
            int count = 0;
            int boost = 0;

            for (int k = 0; k < n; ++k) {
                if (arr[k] >= i) {
                    count = count + 1;
                } else if (arr[k] == i - 1) {
                    boost = boost + 1;
                }
            }

            if (count + Math.min(l, boost) >= i) {
                answer = i;
            }
        }

        System.out.println(answer);
    }
}
