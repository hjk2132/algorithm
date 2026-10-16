package codeTree.trail2.chapter7.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-adjusting-the-temperature-of-the-data-center-2/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();

        int[] tA = new int[n];
        int[] tB = new int[n];

        for (int i = 0; i < n; ++i) {
            tA[i] = sc.nextInt();
            tB[i] = sc.nextInt();
        }

        int max = 0;

        for (int i = -1; i <= 1001; ++i) {
            int sum = 0;

            for (int j = 0; j < n; ++j) {
                if (i < tA[j]) {
                    sum = sum + c;
                } else if (i >= tA[j] && i <= tB[j]) {
                    sum = sum + g;
                } else {
                    sum = sum + h;
                }
            }

            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
        sc.close();
    }
}
