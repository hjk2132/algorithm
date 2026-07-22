package codeTree.trail2.chapter2.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-least-common-multiple-using-recursive-function/description
public class Number21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; ++i) {
            array[i] = sc.nextInt();
        }

        int max = array[0];

        for (int i = 0; i < size; ++i) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println(recursive(max, array));

    }

    public static int recursive(int input, int[] array) {
        boolean isTrue = true;

        for (int i = 0; i < array.length; ++i) {
            if (input % array[i] != 0) {
                isTrue = false;
                break;
            }
        }

        if (isTrue) {
            return input;
        } else {
            return recursive(input + 1, array);
        }
    }
}
