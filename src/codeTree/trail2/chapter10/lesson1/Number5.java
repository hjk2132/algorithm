package codeTree.trail2.chapter10.lesson1;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-group-of-pairs-2/submissions
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[2 * n];

        for (int i = 0; i < 2*n; ++i) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; ++i) {
            if (list[n + i] - list[i] < min) {
                min = list[n + i] - list[i];
            }
        }

        System.out.println(min);
        sc.close();
    }
}
