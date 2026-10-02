package codeTree.trail2.chapter4.lesson4;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-minimum-area-of-rectangle-to-cover-debris/submissions?page=2&page_size=20
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NUMBERS = 2;
        int OFFSET = 1000;
        int AREASIZE = 2 * OFFSET + 1;

        int[] x1 = new int[NUMBERS];
        int[] x2 = new int[NUMBERS];
        int[] y1 = new int[NUMBERS];
        int[] y2 = new int[NUMBERS];
        int[][] area = new int[AREASIZE][AREASIZE];

        // 각 직사각형의 위치를 입력받음
        for (int i = 0; i < NUMBERS; ++i) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            y2[i] = sc.nextInt() + OFFSET;

            // 첫번째 직사각형의 영역을 표기
            if (i == 0) {
                for (int j = x1[i]; j < x2[i]; ++j) {
                    for (int k = y1[i]; k < y2[i]; ++k) {
                        area[j][k] = 1;
                    }
                }
            }
        }

        // 두번째 직사각형 영역을 제외
        for (int i = x1[1]; i < x2[1]; ++i) {
            for (int j = y1[1]; j < y2[1]; ++j) {
                area[i][j] = 0;
            }
        }

        int minX = AREASIZE;
        int maxX = -AREASIZE;
        int minY = AREASIZE;
        int maxY = -AREASIZE;
        boolean isMarked = false;

        // 첫번째 직사각형 중에서 덮혀지지 않은 영역 파악
        for (int i = 0; i < AREASIZE; ++i) {
            for (int j = 0; j < AREASIZE; ++j) {
                // 덮혀지지 않은 영역이라면 덮히지 않은 영역의 (x,y) 최소, 최대 좌표를 측정
                if (area[i][j] == 1) {
                    isMarked = true;

                    if (i < minX) {
                        minX = i;
                    }
                    if (i > maxX) {
                        maxX = i;
                    }
                    if (j < minY) {
                        minY = j;
                    }
                    if (j > maxY) {
                        maxY = j;
                    }
                }
            }
        }

        int answer = (maxX - minX + 1) * (maxY - minY + 1);

        if (isMarked) {
            System.out.println(answer);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
