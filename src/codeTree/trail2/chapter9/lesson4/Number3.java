package codeTree.trail2.chapter9.lesson4;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-l-r-and-b/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[10][10];
        int bX = -1; int bY = -1;
        int rX = -1; int rY = -1;
        int lX = -1; int lY = -1;

        int count = 0;

        for (int i = 0; i < 10; ++i) {
            String str = sc.next();

            for (int j = 0; j < 10; ++j) {
                arr[i][j] = str.charAt(j);

                if (str.charAt(j) == 'B') {
                    bX = j; bY = i;
                } else if (str.charAt(j) == 'R') {
                    rX = j; rY = i;
                } else if (str.charAt(j) == 'L') {
                    lX = j; lY = i;
                }
            }
        }

        int posX = lX;
        int posY = lY;
        int[][] pos = new int[4][2];
        boolean[][] visited = new boolean[10][10];
        visited[posY][posX] = true;

        while (posX != bX || posY != bY) {
            pos[0][0] = posX;
            pos[0][1] = posY - 1;

            pos[1][0] = posX;
            pos[1][1] = posY + 1;

            pos[2][0] = posX - 1;
            pos[2][1] = posY;

            pos[3][0] = posX + 1;
            pos[3][1] = posY;

            boolean[] canMove = new boolean[4];

            for (int i = 0; i < 4; ++i) {
                if (pos[i][0] >= 0 && pos[i][0] < 10 && pos[i][1] >= 0 && pos[i][1] < 10) {
                    if ((pos[i][0] != rX || pos[i][1] != rY) && !visited[pos[i][1]][pos[i][0]]) {
                        canMove[i] = true;
                    } else {
                        canMove[i] = false;
                    }
                } else {
                    canMove[i] = false;
                }
            }

            int[] diff = new int[4];

            for (int i = 0; i < 4; ++i) {
                diff[i] = Math.abs(pos[i][0] - bX) + Math.abs(pos[i][1] - bY);
            }

            int moveIndex = -1;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < 4; ++i) {
                if (canMove[i]) {
                    if (diff[i] < min) {
                        min = diff[i];
                        moveIndex = i;
                    }
                }
            }

            posX = pos[moveIndex][0];
            posY = pos[moveIndex][1];
            visited[posY][posX] = true;

            count = count + 1;
        }

        System.out.println(count - 1);
        sc.close();
    }
}
