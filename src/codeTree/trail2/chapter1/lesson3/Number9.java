package codeTree.trail2.chapter1.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-operational-values-for-two-integers-2/description
public class Number9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[2];

        array[0] = sc.nextInt();
        array[1] = sc.nextInt();

        calculate(array);

        System.out.println(array[0] + " " + array[1]);
    }

    public static void calculate(int[] array) {
        if (array[0] < array[1]) {
            array[0] = array[0] + 10;
            array[1] = array[1] * 2;
        } else {
            array[0] = array[0] * 2;
            array[1] = array[1] + 10;
        }
    }
}
