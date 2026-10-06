package codeTree.trail2.chapter5.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-small-marble-movement/submissions
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        String dir = sc.next();

        int[][] arr = new int[n][n];

        System.out.println(move(arr, t, r, c, n, dir));
        sc.close();
    }

    public static String move(int[][] arr, int t, int r, int c, int n, String dir) {
        int x = r - 1;
        int y = c - 1;
        arr[x][y] = 1;

        int dx = 0;
        int dy = 0;

        for (int i = 0; i < t; ++i) {
            if (dir.equals("U")) {
                dx = -1;

                if (x + dx < 0) {
                    dir = "D";
                    continue;
                } else {
                    arr[x][y] = 0;
                    x = x + dx;
                    arr[x][y] = 1;
                }
            }

            if (dir.equals("D")) {
                dx = 1;

                if (x + dx >= n) {
                    dir = "U";
                    continue;
                } else {
                    arr[x][y] = 0;
                    x = x + dx;
                    arr[x][y] = 1;
                }
            }

            if (dir.equals("L")) {
                dy = -1;

                if (y + dy < 0) {
                    dir = "R";
                    continue;
                } else {
                    arr[x][y] = 0;
                    y = y + dy;
                    arr[x][y] = 1;
                }
            }

            if (dir.equals("R")) {
                dy = 1;

                if (y + dy >= n) {
                    dir = "L";
                    continue;
                } else {
                    arr[x][y] = 0;
                    y = y + dy;
                    arr[x][y] = 1;
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (arr[i][j] == 1) {
                    String answer = (i+1) + " " + (j+1);
                    return answer;
                }
            }
        }

        return "-1 -1";
    }
}
