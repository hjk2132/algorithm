package codeTree.trail2.chapter4.lesson4;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-continuously-overlapping-squares/submissions
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int OFFSET = 100;
        int AREASIZE = OFFSET * 2 + 1;
        int RED = 1;
        int BLUE = 2;

        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int[] y1 = new int[n];
        int[] y2 = new int[n];
        int[][] area = new int[AREASIZE][AREASIZE];

        // 각 직사각형의 위치를 기록
        for (int i = 0; i < n; ++i) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            y2[i] = sc.nextInt() + OFFSET;

            // 각 직사각형 영역에 맞는 색을 기록
            for (int j = x1[i]; j < x2[i]; ++j) {
                for (int k = y1[i]; k < y2[i]; ++k) {
                    // RED
                    if (i % 2 == 0) {
                        area[j][k] = RED;
                    } else {
                        // BLUE
                        area[j][k] = BLUE;
                    }
                }
            }
        }

        int totalBlue = 0;

        // 파란색 영역 합산
        for (int i = 0; i < AREASIZE; ++i) {
            for (int j = 0; j < AREASIZE; ++j) {
                if (area[i][j] == BLUE) {
                    totalBlue = totalBlue + 1;
                }
            }
        }

        System.out.println(totalBlue);
        sc.close();
    }
}
