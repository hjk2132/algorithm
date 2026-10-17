package codeTree.trail2.chapter8.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-three-lines-2/submissions
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; ++i) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt() + 11;
        }

        boolean isCrossed = false;

        for (int i = 0; i < 22; ++i) {
            for (int j = i + 1; j < 22; ++j) {
                for (int k = j + 1; k < 22; ++k) {
                    int count = 0;

                    for (int l = 0; l < n; ++l) {
                        if (arr[l][0] == i || arr[l][0] == j || arr[l][0] == k ||
                                arr[l][1] == i || arr[l][1] == j || arr[l][1] == k) {
                            count = count + 1;
                        }
                    }

                    if (count == n) {
                        isCrossed = true;
                        break;
                    }
                }
            }
        }

        if (isCrossed) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
