package codeTree.trail2.chapter3.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-kth-number/submissions?page=1&page_size=20
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int index = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size - 1 - i; ++j) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(arr[index - 1]);
    }
}
