package codeTree.trail2.chapter4.lesson4;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-area-of-non-overlapping-rectangle/submissions?page=1&page_size=20
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x1 = new int[3];
        int[] x2 = new int[3];
        int[] y1 = new int[3];
        int[] y2 = new int[3];
        int[][] area = new int[2001][2001];

        int OFFSET = 1000;

        // A, B, M 기록
        for (int i = 0; i < 3; ++i) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            y2[i] = sc.nextInt() + OFFSET;

            // A, B로 덮힌 영역 표기
            if (i != 2) {
                for (int j = x1[i]; j < x2[i]; ++j) {
                    for (int k = y1[i]; k < y2[i]; ++k) {
                        area[j][k] = 1;
                    }
                }
            }
        }

        // M이 덮어준 부분 확인
        for (int i = x1[2]; i < x2[2]; ++i) {
            for (int j = y1[2]; j < y2[2]; ++j) {
                area[i][j] = 0;
            }
        }

        int total = 0;

        // M으로 덮이지 않은 A, B 영역의 합
        for (int i = 0; i < 2001; ++i) {
            for (int j = 0; j < 2001; ++j) {
                if (area[i][j] == 1) {
                    total = total + 1;
                }
            }
        }

        System.out.println(total);
        sc.close();
    }
}
