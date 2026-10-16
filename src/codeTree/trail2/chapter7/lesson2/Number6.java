package codeTree.trail2.chapter7.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-the-tip-of-the-iceberg-2/submissions
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;

        for (int i = 0; i <= 1000; ++i) {
            boolean wasUnder = true;
            int count = 0;

            for (int j = 0; j < n; ++j) {
                boolean isUnder = true;

                if (arr[j] > i) {
                    isUnder = false;
                } else {
                    isUnder = true;
                }

                if (wasUnder && !isUnder) {
                    count = count + 1;
                }

                wasUnder = (arr[j] > i) ? false : true;
            }

            if (count > answer) {
                answer = count;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
