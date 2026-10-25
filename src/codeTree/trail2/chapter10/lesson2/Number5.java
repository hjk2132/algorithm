package codeTree.trail2.chapter10.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-all-inclusive-segment/submissions
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];

        int minIdx = 0;
        int maxIdx = 0;

        for (int i = 0; i < n; ++i) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();

            if (start[i] < start[minIdx]) minIdx = i;
            if (end[i] > end[maxIdx]) maxIdx = i;
        }

        int minA = Integer.MAX_VALUE, maxA = Integer.MIN_VALUE;
        int minB = Integer.MAX_VALUE, maxB = Integer.MIN_VALUE;

        for (int i = 0; i < n; ++i) {
            if (i != minIdx) {
                minA = Math.min(minA, start[i]);
                maxA = Math.max(maxA, end[i]);
            }
            if (i != maxIdx) {
                minB = Math.min(minB, start[i]);
                maxB = Math.max(maxB, end[i]);
            }
        }

        int diffA = maxA - minA;
        int diffB = maxB - minB;

        if (diffA > diffB) {
            System.out.println(diffB);
        } else {
            System.out.println(diffA);
        }

        sc.close();
    }
}
