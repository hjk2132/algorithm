package codeTree.trail2.chapter5.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-place-more-than-3-ones/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] direction = new int[4][2];
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        int totalCount = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                direction[0][0] = i;
                direction[0][1] = j - 1;

                direction[1][0] = i;
                direction[1][1] = j + 1;

                direction[2][0] = i - 1;
                direction[2][1] = j;

                direction[3][0] = i + 1;
                direction[3][1] = j;

                if (getCount(arr, direction, i, j, n)) {
                    totalCount = totalCount + 1;
                }
            }
        }

        System.out.println(totalCount);
        sc.close();
    }

    public static boolean getCount(int[][] arr, int[][] direction, int i, int j, int n) {
        int count = 0;

        for (int k = 0; k < 4; ++k) {
            int ni = direction[k][0];
            int nj = direction[k][1];

            if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                if (arr[ni][nj] == 1) {
                    count = count + 1;
                }
            }
        }

        if (count >= 3) {
            return true;
        } else {
            return false;
        }
    }
}
