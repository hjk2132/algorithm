package codeTree.trail2.chapter6.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-G-or-H-2/submissions
public class Number6 {
    public static final int RANGE = 105;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[RANGE];

        // 팻말 기록
        for (int i = 0; i < n; ++i) {
            int index = sc.nextInt();
            String picket = sc.next();

            if (picket.equals("G")) {
                arr[index] = 1;
            } else {
                arr[index] = 2;
            }
        }

        int max = 0;

        // 최대 크기 측정
        for (int i = 0; i <= 100; ++i) {

            // 스캔 범위를 1~100까지 점진적으로 증가
            for (int size = 1; i + size - 1 <= 100; ++size) {

                int gCount = 0;
                int hCount = 0;

                // 시작점과 끝점에 사람이 있는지 확인
                if (arr[i] == 0 || arr[i + size - 1] == 0) {
                    continue;
                }

                // 스캔 범위만큼 g, h 개수 파악
                for (int j = i; j <= i + size - 1; ++j) {
                    if (arr[j] == 1) {
                        gCount = gCount + 1;
                    } else if (arr[j] == 2) {
                        hCount = hCount + 1;
                    } else {
                        continue;
                    }
                }

                // g만 있거나 h만 있거나 g와 h의 개수가 같은 경우
                if (gCount == 0 || hCount == 0 || gCount == hCount) {
                    // 사람이 1명인 경우는 크기가 0임
                    if (size - 1 > max) {
                        max = size - 1;
                    }
                }
            }
        }

        System.out.println(max);
        sc.close();
    }
}
