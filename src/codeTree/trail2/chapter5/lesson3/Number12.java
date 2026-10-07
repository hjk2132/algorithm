package codeTree.trail2.chapter5.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-snail-start-from-center/submissions
public class Number12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int start = n / 2;

        // R - U - L - D
        int[] dx = new int[] {1, 0, -1, 0};
        int[] dy = new int[] {0, -1, 0, 1};

        int dir = 0;
        int num = 1;

        int x = start;
        int y = start;

        for (int i = 1; i <= n * n; ++i) {
            arr[y][x] = num;
            num = num + 1;

            if (i == n * n) break;

            // 회전할 방향을 미리 확인 (우 -> 상 -> 좌 -> 하)
            int nextDir = (dir + 1) % 4;
            int tX = x + dx[nextDir];
            int tY = y + dy[nextDir];

            // 범위 체크 및 빈 칸 검사
            boolean xRange = (tX >= 0 && tX < n) ? true : false;
            boolean yRange = (tY >= 0 && tY < n) ? true : false;
            boolean isEmpty = false;

            if (xRange && yRange) {
                isEmpty = (arr[tY][tX] == 0) ? true : false;
            }

            // 첫 걸음(i == 1) 이후로, '꺾을 방향'이 비어있다면 바로 그 방향으로 회전
            if (i > 1 && xRange && yRange && isEmpty) {
                dir = nextDir;
            }

            // 다음 칸으로 이동
            x = x + dx[dir];
            y = y + dy[dir];
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
