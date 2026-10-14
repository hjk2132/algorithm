package codeTree.trail2.chapter7.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-line-segments-that-do-not-overlap-2/submissions
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            boolean isCrossed = false;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if ((x1[i] < x1[j] && x2[i] > x2[j]) || (x1[i] > x1[j] && x2[i] < x2[j])) {
                    isCrossed = true;
                    break;
                }
            }

            if (!isCrossed) {
                answer = answer + 1;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
