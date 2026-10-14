package codeTree.trail2.chapter7.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-create-triangle/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int maxArea = 0;

        for (int i = 0; i < n; ++i) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = j + 1; k < n; ++k) {
                    // sameY
                    if (x[i] == x[j] || x[i] == x[k] || x[j] == x[k]) {
                        int rangeX = -1;
                        int rangeY = -1;

                        // sameX
                        if (y[i] == y[j]) {
                            rangeX = Math.abs(x[i] - x[j]);
                            rangeY = Math.abs(y[j] - y[k]);
                        } else if (y[i] == y[k]) {
                            rangeX = Math.abs(x[i] - x[k]);
                            rangeY = Math.abs(y[k] - y[j]);
                        } else if (y[j] == y[k]) {
                            rangeX = Math.abs(x[j] - x[k]);
                            rangeY = Math.abs(y[k] - y[i]);
                        } else {
                            continue;
                        }

                        int area = rangeX * rangeY;

                        if (area > maxArea) {
                            maxArea = area;
                        }
                    }
                }
            }
        }

        System.out.println(maxArea);
        sc.close();
    }
}
