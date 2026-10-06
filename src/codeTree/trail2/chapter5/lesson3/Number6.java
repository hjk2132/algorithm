package codeTree.trail2.chapter5.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-come-back/submissions
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // { N, S, E, W }
        int[] dx = { 0, 0, 1, -1 };
        int[] dy = { 1, -1, 0, 0 };

        int x = 0;
        int y = 0;
        int timeCount = 0;
        boolean isZero = false;

        for (int i = 0; i < n; ++i) {
            String dir = sc.next();
            int distance = sc.nextInt();

            for (int j = 0; j < distance; ++j) {
                if (dir.equals("N")) {
                    x = x + dx[0];
                    y = y + dy[0];
                }

                if (dir.equals("S")) {
                    x = x + dx[1];
                    y = y + dy[1];
                }

                if (dir.equals("E")) {
                    x = x + dx[2];
                    y = y + dy[2];
                }

                if (dir.equals("W")) {
                    x = x + dx[3];
                    y = y + dy[3];
                }

                timeCount = timeCount + 1;

                if (x == 0 && y == 0) {
                    isZero = true;
                    System.out.println(timeCount);
                    break;
                }
            }

            if (isZero == true) {
                break;
            }
        }
        if (isZero == false) {
            System.out.println(-1);
        }
        sc.close();
    }
}
