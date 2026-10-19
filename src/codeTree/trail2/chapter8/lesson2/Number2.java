package codeTree.trail2.chapter8.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-find-smallest-x/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] list = new int[n][2];
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < n; ++i) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }

        for (int i = 1; i <= 10000; ++i) {
            int value = i;
            boolean goNext = true;

            for (int j = 1; j <= n; ++j) {
                value = i * (int) Math.pow(2, j);

                if (value < list[j-1][0] || value > list[j-1][1]) {
                    goNext = false;
                    break;
                }
            }

            if (!goNext) {
                continue;
            } else {
                if (i < answer) {
                    answer = i;
                    break;
                }
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
