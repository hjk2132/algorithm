package codeTree.trail2.chapter5.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-shoot-a-laser-in-the-mirror-2/submissions
public class Number9 {
    static final int UP = 0;
    static final int DOWN = 1;
    static final int LEFT = 2;
    static final int RIGHT = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 진입점 상하좌우 기준 ( ' /  ' = l )
        int[] ldx = { 1, -1, 0, 0 };
        int[] ldy = { 0, 0, 1, -1 };

        // 진입점 상하좌우 기준  ( ' \ ' = r )
        int[] rdx = { -1, 1, 0, 0 };
        int[] rdy = { 0, 0, -1, 1 };

        String[][] arr = new String[n][n];

        for (int y = 0; y < n; ++y) {
            String input = sc.next();

            for (int x = 0; x < n; ++x) {
                arr[y][x] = input.substring(x, x + 1);
            }
        }

        int k = sc.nextInt();
        int r = 0;
        int c = 0;
        int dir = DOWN;

        // 최초 시작점 위치와 방향 결정
        if (k >= 1 && k <= n) {
            r = 0;
            c = k - 1;
            dir = DOWN;
        } else if (k > n && k <= 2 * n) {
            r = (k - n) - 1;
            c = n - 1;
            dir = LEFT;
        } else if (k > 2 * n && k <= 3 * n) {
            r = n - 1;
            c = n - (k - 2 * n);
            dir = UP;
        } else {
            r = n - (k - 3 * n);
            c = 0;
            dir = RIGHT;
        }

        int y = r;
        int x = c;
        int count = 0;

        while(x >= 0 && x < n && y >= 0 && y < n) {
            count = count + 1;

            if (arr[y][x].equals("/")) {
                if (dir == UP) {
                    x = x + ldx[UP];
                    y = y + ldy[UP];
                    dir = RIGHT;
                } else if (dir == DOWN) {
                    x = x + ldx[DOWN];
                    y = y + ldy[DOWN];
                    dir = LEFT;
                } else if (dir == LEFT) {
                    x = x + ldx[LEFT];
                    y = y + ldy[LEFT];
                    dir = DOWN;
                } else {
                    x = x + ldx[RIGHT];
                    y = y + ldy[RIGHT];
                    dir = UP;
                }
            } else if (arr[y][x].equals("\\")) {
                if (dir == UP) {
                    x = x + rdx[UP];
                    y = y + rdy[UP];
                    dir = LEFT;
                } else if (dir == DOWN) {
                    x = x + rdx[DOWN];
                    y = y + rdy[DOWN];
                    dir = RIGHT;
                } else if (dir == LEFT) {
                    x = x + rdx[LEFT];
                    y = y + rdy[LEFT];
                    dir = UP;
                } else {
                    x = x + rdx[RIGHT];
                    y = y + rdy[RIGHT];
                    dir = DOWN;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
