package codeTree.trail2.chapter8.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-hill-cutting/submissions
public class Number10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i <= 83; ++i) {
            int sum = 0;

            for (int j = 0; j < n; ++j) {
                int cost = 0;

                if (arr[j] < i) {
                    cost = (i - arr[j]) * (i - arr[j]);
                } else if (arr[j] > i + 17) {
                    cost = (arr[j] - (i + 17)) * (arr[j] - (i + 17));
                }

                sum = sum + cost;
            }

            if (sum < answer) {
                answer = sum;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
