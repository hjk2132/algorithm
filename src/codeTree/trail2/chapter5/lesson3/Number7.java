package codeTree.trail2.chapter5.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-come-back-2/submissions
public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String instruction = sc.next();
        int length = instruction.length();

        int x = 0;
        int y = 0;

        // Left-Up-Rright-Down
        int[] dx = new int[] { -1, 0, 1, 0 };
        int[] dy = new int[] { 0, 1, 0, -1 };

        // N = 0, E = 1, S = 2, W = 3
        int dir = 0;
        boolean isZero = false;

        for (int i = 0; i < length; ++i) {
            String command = instruction.substring(i, i+1);

            if (command.equals("L")) {
                dir = (dir - 1 + 4) % 4;
                continue;
            }

            if (command.equals("R")) {
                dir = (dir + 1 + 4) % 4;
                continue;
            }

            if (command.equals("F")) {
                x = x + dx[dir];
                y = y + dy[dir];

                if (x == 0 && y == 0) {
                    isZero = true;
                    System.out.println(i + 1);
                }
            }

            if(isZero) {
                break;
            }
        }

        if(!isZero) {
            System.out.println(-1);
        }
        sc.close();
    }
}
