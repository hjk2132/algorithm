package codeTree.trail2.chapter1.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-divide-even-numbers-by-2/submissions?page=1&page_size=20
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; ++i) {
            array[i] = sc.nextInt();
        }

        divide(array);

        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
    }

    public static void divide(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] / 2;
            }
        }
    }
}
