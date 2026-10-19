package codeTree.trail2.chapter8.lesson2;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-maximum-difference-in-numbers/description
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int max = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (arr[j] - arr[i] > k) { continue; }
                else {
                    int count = j - i + 1;
                    if (count > max) { max = count; }
                }
            }
        }

        System.out.println(max);
        sc.close();
    }
}
