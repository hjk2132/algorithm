package codeTree.trail2.chapter4.lesson4;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-the-total-area-of-colored-paper/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];
        int[][] area = new int[201][201];

        int OFFSET = 100;
        int PAGESIZE = 8;

        // 각 색종이 위치 입력받음
        for (int i = 0; i < n; ++i) {
            x[i] = sc.nextInt() + OFFSET;
            y[i] = sc.nextInt() + OFFSET;

            // 각 색종이로 덮는 영역 표기
            for (int j = x[i]; j < x[i] + PAGESIZE; ++j) {
                for (int k = y[i]; k < y[i] + PAGESIZE; ++k) {
                    area[j][k] = 1;
                }
            }
        }

        int total = 0;

        // 색종이로 덮힌 영역 합산
        for (int i = 0; i < 201; ++i) {
            for (int j = 0; j < 201; ++j) {
                if (area[i][j] == 1) {
                    total = total + 1;
                }
            }
        }

        System.out.println(total);
        sc.close();
    }
}
