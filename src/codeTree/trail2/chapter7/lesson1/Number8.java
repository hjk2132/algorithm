package codeTree.trail2.chapter7.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-developers-rank/submissions
public class Number8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[][] record = new int[k][n];

        for (int i = 0; i < k; ++i) {
            for (int j = 0; j < n; ++j) {
                record[i][j] = sc.nextInt();
            }
        }

        int totalCount = 0;

        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {

                if (i == j) {
                    continue;
                }

                int a = i;
                int b = j;

                boolean isTrue = true;

                for (int l = 0; l < k; ++l) {
                    for (int m = 0; m < n; ++m) {
                        for (int o = m + 1; o < n; ++o) {
                            int first = record[l][m];
                            int second = record[l][o];

                            if ((first == a || first == b) && (second == a || second == b)) {
                                if (first != a) {
                                    isTrue = false;
                                }
                            }
                        }
                    }

                    if (!isTrue) {
                        break;
                    }
                }

                if (isTrue) {
                    // System.out.println("a, b = " + a + " " + b);
                    totalCount = totalCount + 1;
                }
            }
        }

        System.out.println(totalCount);
        sc.close();
    }
}
