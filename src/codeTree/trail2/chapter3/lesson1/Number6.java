package codeTree.trail2.chapter3.lesson1;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-group-of-pairs/submissions?page=1&page_size=20
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int groupSize = sc.nextInt();
        int[] arr = new int[groupSize*2];

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int max = 0;

        for (int i = 0; i < groupSize; ++i) {
            int start = i;
            int end = arr.length - 1 - i;

            if (arr[start] != arr[end]) {
                int sum = arr[start] + arr[end];
                if (sum > max) {
                    max = sum;
                }
            }
        }

        if (max == 0) {
            System.out.println(arr[0] * 2);
        } else {
            System.out.println(max);
        }
    }
}
