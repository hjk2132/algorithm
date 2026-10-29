package codeTree.trail3.chapter3.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-implement-insertion-sort/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; ++i) {
            int j = i - 1;
            int val = arr[i];

            while(j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = val;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
