package codeTree.trail2.chapter9.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-overlapping-line-segments/submissions
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] lines = new int[n][2];

        for (int i = 0; i < n; ++i) {
            lines[i][0] = sc.nextInt();
            lines[i][1] = sc.nextInt();
        }

        boolean isClear = false;

        for (int i = 1; i <= 100; ++i) {
            boolean isPass = true;

            for (int j = 0; j < n; ++j) {
                if(i < lines[j][0] || i > lines[j][1]) {
                    isPass = false;
                    break;
                }
            }

            if (isPass) {
                System.out.println("Yes");
                isClear = true;
                break;
            }
        }

        if (!isClear) {
            System.out.println("No");
        }
        sc.close();
    }
}
