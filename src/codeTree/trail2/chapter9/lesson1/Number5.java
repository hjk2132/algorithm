package codeTree.trail2.chapter9.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-overlapping-line-segments-2/submissions
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] lines = new int[n][2];
        boolean isClear = false;

        for (int i = 0; i < n; ++i) {
            lines[i][0] = sc.nextInt();
            lines[i][1] = sc.nextInt();
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 1; j <= 100; ++j) {
                boolean isPass = true;

                for (int k = 0; k < n; ++k) {
                    if (k == i) { continue; }

                    if (j < lines[k][0] || j > lines[k][1]) {
                        isPass = false;
                        break;
                    }
                }

                if (isPass) {
                    isClear = true;
                    break;
                }
            }

            if (isClear) { break; }
        }

        if (isClear) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
