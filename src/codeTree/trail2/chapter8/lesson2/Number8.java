package codeTree.trail2.chapter8.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-restore-initial-sequence/submissions
public class Number8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(1);
            sc.close();
            return;
        }

        int[] answer = new int[n];
        int[] list = new int[n-1];

        for (int i = 0; i < n-1; ++i) {
            list[i] = sc.nextInt();
        }

        for (int i = 1; i <= Math.min(n, list[0] - 1); ++i) {
            boolean[] checkList = new boolean[n+1];
            boolean isPassed = true;

            for (int j = 0; j < n; ++j) {
                if (j == 0) {
                    answer[j] = i;
                    checkList[answer[j]] = true;
                } else {
                    int val = list[j-1] - answer[j-1];
                    if (val < 1 || val > n || checkList[val]) {
                        isPassed = false;
                        break;
                    }
                    answer[j] = val;
                    checkList[answer[j]] = true;
                }
            }

            if (isPassed) {
                break;
            }
        }

        for (int i = 0; i < n; ++i) {
            System.out.print(answer[i] + " ");
        }

        sc.close();
    }
}
