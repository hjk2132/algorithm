package codeTree.trail2.chapter9.lesson4;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-maximum-product-of-three-numbers/submissions
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        int[] copy = new int[n];

        for (int i = 0; i < n; ++i) {
            list[i] = sc.nextInt();
            copy[i] = list[i];
        }

        Arrays.sort(copy);

        int allPositive = copy[n-1] * copy[n-2] * copy[n-3];
        int allNegative = copy[0] * copy[1] * copy[n-1];

        if (allPositive > allNegative) {
            System.out.println(allPositive);
        } else {
            System.out.println(allNegative);
        }
        sc.close();
    }
}
