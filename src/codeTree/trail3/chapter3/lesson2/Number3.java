package codeTree.trail3.chapter3.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-implement-selection-sort/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; ++i) {
            int min = Integer.MAX_VALUE;
            int index = -1;

            for (int j = i; j < n; ++j) {
                if (arr[j] < min) {
                    index = j;
                    min = arr[j];
                }
            }

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
