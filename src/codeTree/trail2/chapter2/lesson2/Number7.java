package codeTree.trail2.chapter2.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-output-value-based-on-odd-even-numbers/description
public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(recursion(input));
    }

    public static int recursion(int input) {
        if (input == 2 || input == 1) {
            return input;
        }
        if (input % 2 == 0) {
            return input + recursion(input - 2);
        } else {
            return input + recursion(input - 2);
        }
    }

}
