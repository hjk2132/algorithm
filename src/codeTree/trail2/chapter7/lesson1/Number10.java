package codeTree.trail2.chapter7.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-remove-three-segments/submissions
public class Number10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] lines = new int[n][2];

        for (int i = 0; i < n; ++i) {
            lines[i][0] = sc.nextInt();
            lines[i][1] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = j + 1; k < n; ++k) {
                    int duplicate = 0;
                    boolean isPass = true;

                    // 좌표 순환
                    for (int l = 0; l <= 100; ++l) {
                        duplicate = 0;

                        // i, j, k를 제외한 선분들이 몇 개가 올라가는지
                        for (int m = 0; m < n; ++m) {
                            if (m == i || m == j || m == k) { continue; }

                            if (l >= lines[m][0] && l <= lines[m][1]) {
                                duplicate = duplicate + 1;
                            }

                            if (duplicate >= 2) {
                                isPass = false;
                                break;
                            }
                        }

                        if (!isPass) { break; }
                    }

                    if (isPass) {
                        count = count + 1;
                    }
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
