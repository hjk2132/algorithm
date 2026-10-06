package codeTree.trail2.chapter5.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-snail-number-square/submissions
public class Number5 {
    static final int RIGHT = 0;
    static final int DOWN = 1;
    static final int LEFT = 2;
    static final int UP = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        // R - D - L - U
        int[] dy = {0, 1, 0, -1};
        int[] dx = {1, 0, -1, 0};

        int y = 0, x = 0;
        int dir = RIGHT;

        for (int num = 1; num <= n * m; num++) {
            arr[y][x] = num;

            // 다음 위치 계산
            int ny = y + dy[dir];
            int nx = x + dx[dir];

            // 범위를 벗어나거나, 이미 숫자가 채워져 있다면 회전
            if (ny < 0 || ny >= n || nx < 0 || nx >= m || arr[ny][nx] != 0) {
                dir = (dir + 1) % 4;
                ny = y + dy[dir];
                nx = x + dx[dir];
            }

            // 위치 갱신
            y = ny;
            x = nx;
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
