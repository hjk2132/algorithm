package codeTree.trail2.chapter6.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-best-place-of-13-2/submissions
public class Number15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[][] count = new int[n][n - 2];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - 2; ++j) {
                int temp = 0;
                for (int k = 0; k < 3; ++k) {
                    if (arr[i][j + k] == 1) {
                        temp = temp + 1;
                    }
                }
                count[i][j] = temp;
            }
        }

        int ans = 0;

        // 첫 번째 블록
        for (int i1 = 0; i1 < n; ++i1) {
            for (int j1 = 0; j1 < n - 2; ++j1) {

                // 두 번째 블록
                for (int i2 = 0; i2 < n; ++i2) {
                    for (int j2 = 0; j2 < n - 2; ++j2) {

                        // 같은 행에 있을 때 겹치는지
                        if (i1 == i2 && Math.abs(j1 - j2) < 3) {
                            continue;
                        }

                        // 두 블록의 합으로 최댓값 갱신
                        int currentSum = count[i1][j1] + count[i2][j2];
                        ans = Math.max(ans, currentSum);
                    }
                }

            }
        }

        System.out.println(ans);
        sc.close();
    }
}
