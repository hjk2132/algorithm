package codeTree.trail2.chapter8.lesson1;

import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];

        for (int i = 0; i < n; ++i) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 2; i <= 100; i = i + 2) {
            for (int j = 2; j <= 100; j = j + 2) {

                int[] area = new int[4];
                int max = -1;

                for (int k = 0; k < n; ++k) {
                    int x = points[k][0];
                    int y = points[k][1];

                    if (x < i && y < j) {
                        area[0] = area[0] + 1;
                    } else if (x < i && y > j) {
                        area[1] = area[1] + 1;
                    } else if (x > i && y > j) {
                        area[2] = area[2] + 1;
                    } else {
                        area[3] = area[3] + 1;
                    }
                }

                for (int k = 0; k < 4; ++k) {
                    if (area[k] > max) {
                        max = area[k];
                    }
                }

                if (max < min) {
                    min = max;
                }
            }
        }

        System.out.println(min);
        sc.close();
    }
}
