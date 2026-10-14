package codeTree.trail2.chapter7.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-specific-zone-above-the-2d-coordinate-2/submissions
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; ++i) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int minArea = Integer.MAX_VALUE;

        // i = exception
        for (int i = 0; i < n; ++i) {
            int xMin = Integer.MAX_VALUE;
            int yMin = Integer.MAX_VALUE;
            int xMax = 0;
            int yMax = 0;

            // check min, max
            for (int j = 0; j < n; ++j) {
                if (j != i) {
                    int tempX = x[j];
                    int tempY = y[j];

                    if (tempX < xMin) { xMin = tempX; }
                    if (tempX > xMax) { xMax = tempX; }
                    if (tempY < yMin) { yMin = tempY; }
                    if (tempY > yMax) { yMax = tempY; }
                }
            }

            int tempArea = (xMax - xMin) * (yMax - yMin);

            if (tempArea < minArea) {
                minArea = tempArea;
            }
        }

        System.out.println(minArea);
        sc.close();
    }
}
