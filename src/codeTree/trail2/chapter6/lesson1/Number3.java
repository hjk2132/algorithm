package codeTree.trail2.chapter6.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-cattle-in-a-rowing-up-2/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int count = 0;

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                for (int k = j; k < n; ++k) {
                    if (i < j && j < k) {
                        if (arr[i] <= arr[j] && arr[j] <= arr[k]) {
                            count = count + 1;
                        }
                    }
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
