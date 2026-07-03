package codeTree.trail2.chapter2.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-star-output-with-recursive-function-2/submissions?page=1&page_size=20
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        printStarDown(input, 1);
        printStarUp(1, input);

    }

    public static void printStarDown(int input, int min) {
        if (input < min) {
            return;
        } else {
            for(int i = 0; i < input; ++i) {
                System.out.print("* ");
            }
            System.out.println();
            printStarDown(input - 1, min);
        }
    }

    public static void printStarUp(int input, int max) {
        if (input > max) {
            return;
        } else {
            for(int i = 0; i < input; ++i) {
                System.out.print("* ");
            }
            System.out.println();
            printStarUp(input + 1, max);
        }
    }
}
