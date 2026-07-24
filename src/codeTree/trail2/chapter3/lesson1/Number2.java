package codeTree.trail2.chapter3.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-string-sort/submissions?page=1&page_size=20
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        array(arr);

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]);
        }
    }

    public static void array(char[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            for (int j = 0; j < array.length - 1 - i; ++j) {
                if (array[j] > array[j + 1]) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
