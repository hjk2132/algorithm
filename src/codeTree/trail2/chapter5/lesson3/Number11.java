package codeTree.trail2.chapter5.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-snail-alphabet-square/submissions
public class Number11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] arr = new char[n][m];

        // R - D - W - E
        int[] dx = new int[] {1, 0, -1, 0};
        int[] dy = new int[] {0, 1, 0, -1};

        int dir = 0;
        int num = 0;

        int x = 0;
        int y = 0;

        arr[0][0] = 'A';

        for (int i = 0; i < n * m - 1; ++i) {
            int tX = x + dx[dir];
            int tY = y + dy[dir];

            boolean xRange = (tX >= 0 && tX < m) ? true : false;
            boolean yRange = (tY >= 0 && tY < n) ? true : false;
            boolean isEmpty = false;

            if (xRange && yRange) {
                isEmpty = (arr[tY][tX] == 0) ? true : false;
            }

            if (!xRange || !yRange || !isEmpty) {
                dir = (dir + 1) % 4;
            }

            num = (num + 1) % 26;

            x = x + dx[dir];
            y = y + dy[dir];
            arr[y][x] = (char) ('A' + num);
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
