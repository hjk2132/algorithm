package codeTree.trail2.chapter2.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-to-output-numerically/description
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        recursive(1, input);
        System.out.println();
        reRecursive(input);
    }

    public static void recursive(int n, int input) {
        if (n <= input) {
            System.out.print(n + " ");
            recursive((n + 1), input);
        } else {
            return ;
        }
    }

    public static void reRecursive(int n) {
        if (n >= 1) {
            System.out.print(n + " ");
            reRecursive(n - 1);
        } else {
            return ;
        }
    }
}
