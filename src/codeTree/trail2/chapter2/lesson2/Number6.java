package codeTree.trail2.chapter2.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-factorial/description
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));
    }

    public static int factorial(int input) {
        if (input == 0) {
            return 1;
        } else if (input == 1) {
            return 1;
        } else {
            return (input) * factorial(input - 1);
        }
    }
}
