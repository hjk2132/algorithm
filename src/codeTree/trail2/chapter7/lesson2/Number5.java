package codeTree.trail2.chapter7.lesson2;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-arithmetic-sequence/submissions
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[n-1];
        int answer = 0;

        for (int i = min; i <= max; ++i) {
            int count = 0;

            for (int j = 0; j < n; ++j) {
                for (int k = j + 1; k < n; ++k) {
                    int d1 = i - arr[j];
                    int d2 = arr[k] - i;

                    if (d1 == d2) {
                        count = count + 1;
                    }
                }
            }

            if (count > answer) {
                answer = count;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
