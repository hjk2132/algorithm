package codeTree.trail2.chapter6.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-on-the-checkboard-2/submissions
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        char[][] arr = new char[r][c];

        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                String str = sc.next();
                arr[i][j] = str.charAt(0);
            }
        }

        char start = arr[0][0];
        char end = arr[r-1][c-1];
        int count = 0;

        for (int i = 1; i < r - 1; ++i) {
            for (int j = 1; j < c - 1; ++j) {
                char p1 = arr[i][j];

                for (int k = 1; k < r - 1; ++k) {
                    for (int l = 1; l < c - 1; ++l) {
                        char p2 = arr[k][l];

                        if (k > i && l > j) {
                            if (p1 != start && p1 != p2 && p2 != end) {
                                count = count + 1;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
