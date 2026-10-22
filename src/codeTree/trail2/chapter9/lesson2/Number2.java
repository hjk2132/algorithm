package codeTree.trail2.chapter9.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-run-and-run/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; ++i) {
            start[i] = sc.nextInt();
        }

        for (int i = 0; i < n; ++i) {
            end[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; ++i) {
            if (start[i] > end[i]) {
                int diff = Math.abs(start[i] - end[i]);
                start[i] = start[i] - diff;
                start[i+1] = start[i+1] + diff;
                count = count + diff;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
