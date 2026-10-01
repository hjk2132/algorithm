package codeTree.trail2.chapter4.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-block-stacking-commands2/submissions
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] array = new int[n];
        int max = -1;

        for (int i = 0; i < k; ++i) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            if (a > b) {
                int temp = a;
                b = a;
                a = temp;
            }

            for (int j = a; j <= b; ++j) {
                array[j] = array[j] + 1;
            }
        }

        for (int i = 0; i < n; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(max);
    }
}
