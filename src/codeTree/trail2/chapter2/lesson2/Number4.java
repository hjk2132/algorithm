package codeTree.trail2.chapter2.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-fibonacci-using-recursive-function/description
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[] {1, 1, 2};

        fibonacci(arr, 3, input);
    }

    public static void fibonacci(int[] arr, int count, int input) {
        if (input == 1 || input == 2 || count == input) {
            if (input == 1 || input == 2) {
                System.out.println(1);
            } else {
                System.out.println(arr[2]);
            }
        } else {
            int next = arr[1] + arr[2];
            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = next;

            count = count + 1;

            fibonacci(arr, count, input);
        }
    }
}
