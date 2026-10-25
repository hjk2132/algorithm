package codeTree.trail2.chapter10.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-reorder-sequence/submissions
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        int answer = 0;

        for (int i = 0; i < n; ++i) {
            list[i] = sc.nextInt();
        }

        int before = list[n-1];
        for (int j = 1; j < n; ++j) {
            if (before < list[n - j - 1]) {
                answer = n - j;
                break;
            } else {
                before = list[n - j - 1];
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
