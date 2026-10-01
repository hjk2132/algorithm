package codeTree.trail2.chapter4.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-maximum-overlapped-points/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[100];
        int max = -1;

        for (int i = 0; i < n; ++i) {
            int x1 = sc.nextInt() - 1;
            int x2 = sc.nextInt() - 1;

            for (int j = x1; j <= x2; ++j) {
                array[j] = array[j] + 1;
            }
        }

        for (int i = 0; i < 100; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(max);
        sc.close();
    }
}
