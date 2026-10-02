package codeTree.trail2.chapter4.lesson4;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-total-width-of-a-rectangle2/description
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] area = new int[201][201];

        for (int i = 0; i < n; ++i) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;

            for (int j = x1; j < x2; ++j) {
                for (int k = y1; k < y2; ++k) {
                    area[j][k] = 1;
                }
            }
        }

        int total = 0;

        for (int i = 0; i < 201; ++i) {
            for (int j = 0; j < 201; ++j) {
                if (area[i][j] == 1) {
                    total = total + 1;
                }
            }
        }

        System.out.println(total);
    }
}
