package codeTree.trail2.chapter1.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-find-the-absolute-value/description
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; ++i) {
            array[i] = sc.nextInt();
        }

        makeAbsolute(array);

        for (int i = 0; i < size; ++i) {
            System.out.print(array[i] + " ");
        }

    }

    public static void makeAbsolute(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] < 0) {
                array[i] = - array[i];
            }
        }
    }
}
