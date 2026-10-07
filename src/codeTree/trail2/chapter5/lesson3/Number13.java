package codeTree.trail2.chapter5.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-add-all-the-numbers-on-the-path/submissions
public class Number13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n / 2;

        int len = sc.nextInt();
        String str = sc.next();

        // R - U - W - S
        int[] dx = new int[] {1, 0, -1, 0};
        int[] dy = new int[] {0, -1, 0, 1};
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = arr[mid][mid];
        int dir = 1;

        int x = mid;
        int y = mid;

        for (int i = 0; i < len; ++i) {
            String s = str.substring(i, i+1);

            if (s.equals("R")) {
                dir = ((dir - 1) + 4) % 4;
                continue;
            }

            if (s.equals("L")) {
                dir = (dir + 1) % 4;
                continue;
            }

            if (s.equals("F")) {
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    x = nx;
                    y = ny;
                    sum = sum + arr[y][x];
                }
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
