package codeTree.trail2.chapter9.lesson3;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-create-consecutive-numbers-3/submissions
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < 3; ++i) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int count = Math.max(arr[2]-arr[1]-1, arr[1]-arr[0]-1);

        System.out.println(count);
        sc.close();
    }
}
