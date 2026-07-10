package codeTree.trail2.chapter2.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-maximum-value-with-recursive-function/description
public class Number10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        isMax(arr, 0, 0);
    }

    public static void isMax(int[] arr, int count, int max) {
        if (count == arr.length - 1) {
            System.out.println(max);
        } else {
            if (arr[count] > max) {
                max = arr[count];
                count = count + 1;
                isMax(arr, count, max);
            } else {
                count = count + 1;
                isMax(arr, count, max);
            }
        }
    }
}
