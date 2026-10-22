package codeTree.trail2.chapter9.lesson3;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-create-consecutive-numbers-2/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        Arrays.sort(arr);

        if (arr[1] - arr[0] == 1 && arr[2] - arr[1] == 1) {
            System.out.println(0);
        } else if (arr[1] - arr[0] == 2 || arr[2] - arr[1] == 2) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

        sc.close();
    }
}
