package codeTree.trail2.chapter6.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-taking-a-taxi-in-the-middle-of-the-marathon-2/description
public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] checkPoints = new int[n][2];

        for (int i = 0; i < n; ++i) {
            checkPoints[i][0] = sc.nextInt();
            checkPoints[i][1] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < n - 1; ++i) {
            int disSum = 0;

            int x1 = checkPoints[0][0];
            int y1 = checkPoints[0][1];

            // System.out.println("========= i = " + i + " =========");

            for (int j = 1; j < n; ++j) {
                if (j == i) {
                    continue;
                }

                int x2 = checkPoints[j][0];
                int y2 = checkPoints[j][1];

                int distance = Math.abs(x1 - x2) + Math.abs(y1 - y2);
                disSum = disSum + distance;

                // System.out.println("p1 : " + x1 + " " + y1);
                // System.out.println("p2 : " + x2 + " " + y2);
                // System.out.println("sum, distance : " + disSum + " " + distance);
                // System.out.println();

                x1 = x2;
                y1 = y2;
            }

            if (disSum < min) {
                min = disSum;
            }


        }

        System.out.println(min);
        sc.close();
    }
}
