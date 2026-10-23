package codeTree.trail2.chapter9.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-study-cafe-keeping-distance-2/submissions
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int[] arr = new int[n];

        String str = sc.next();

        for (int i = 0; i < n; ++i) {
            if(str.charAt(i) == '0') {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        for (int i = 0; i < n; ++i) {
            if (arr[i] == 1) { continue; }

            int[] copy = new int[n];

            for (int j = 0; j < n; ++j) {
                if (j == i) {
                    copy[j] = 1;
                    continue;
                }
                copy[j] = arr[j];
            }

            int before = -1;
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < n; ++j) {
                if (copy[j] == 1) {
                    if (before == -1) {
                        before = j;
                    } else {
                        int diff = j - before;
                        if (diff < min) {
                            min = diff;
                        }
                        before = j;
                    }
                }
            }

            if (min > max) {
                max = min;
            }
        }

        System.out.println(max);
        sc.close();
    }
}
