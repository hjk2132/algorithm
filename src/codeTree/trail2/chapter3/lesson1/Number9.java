package codeTree.trail2.chapter3.lesson1;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-get-median-2/submissions?page=1&page_size=20
public class Number9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; ++i) {
            arr[i] = sc.nextInt();

            if ((i + 1) % 2 != 0) {
                int[] temp = new int[i + 1];

                for (int j = 0; j <= i; ++j) {
                    temp[j] = arr[j];
                }

                Arrays.sort(temp);

                System.out.print(temp[i/2] + " ");
            }
        }
    }
}
