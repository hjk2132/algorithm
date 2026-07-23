package codeTree.trail2.chapter3.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-inc-dec-sorting/submissions?page=1&page_size=20
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; ++i) {
            array[i] = sc.nextInt();
        }

        aesc(array);

        for (int i = 0; i < size; ++i) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < size; ++i) {
            System.out.print(array[size - i - 1] + " ");
        }

    }

    public static void aesc(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (array[j] > array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
