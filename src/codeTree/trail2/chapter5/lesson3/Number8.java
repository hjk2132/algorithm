package codeTree.trail2.chapter5.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-comfortable-state-on-the-grid/submissions
public class Number8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        // int[y = r][x = c];
        int[][] array = new int[n][n];

        // N - E - S - W
        int[] dx = new int[] { 0, 1, 0, -1 };
        int[] dy = new int[] { 1, 0, -1, 0 };

        for (int i = 0; i < m; ++i) {
            int y = sc.nextInt() - 1;
            int x = sc.nextInt() - 1;

            array[y][x] = 1;
            int count = 0;

            for (int j = 0; j < 4; ++j) {
                int tX = x;
                int tY = y;

                tX = tX + dx[j];
                tY = tY + dy[j];

                if (tX >= 0 && tX < n && tY >= 0 && tY < n) {
                    if (array[tY][tX] == 1) {
                        count = count + 1;
                    }
                }
            }

            if (count == 3) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        sc.close();
    }

    public static void print(int[][] arr, int n) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
