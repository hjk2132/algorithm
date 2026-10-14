package codeTree.trail2.chapter7.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-closest-pair-of-points/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; ++i) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int distance = Integer.MAX_VALUE;

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int x1 = x[i];
                int x2 = x[j];
                int y1 = y[i];
                int y2 = y[j];

                int tDistance = (int) Math.pow(x1 - x2, 2) + (int) Math.pow(y1 - y2, 2);

                if (tDistance < distance) {
                    distance = tDistance;
                }
            }
        }

        System.out.println(distance);
        sc.close();
    }
}
