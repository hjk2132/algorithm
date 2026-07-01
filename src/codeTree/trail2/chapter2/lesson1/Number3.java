package codeTree.trail2.chapter2.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-star-output-with-recursive-function/description
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        printStar(1, input);
    }

    public static void printStar(int input, int max) {
        if (input > max) {
            return;
        } else {
            for (int i = 0; i < input; ++i) {
                System.out.print("*");
            }
            System.out.println();

            printStar(input + 1, max);
        }
    }
}
