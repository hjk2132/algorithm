package codeTree.trail2.chapter9.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-abc-line-up/submissions
public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            char ch = sc.next().charAt(0);
            arr[i] = ch - 'A';
        }

        int count = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count = count + 1;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
