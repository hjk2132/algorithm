package codeTree.trail2.chapter1.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-repeated-output/description
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        printN(input);
        sc.close();
    }

    public static void printN(int n) {
        for (int i = 0; i < n; ++i) {
            System.out.println("12345^&*()_");
        }
    }
}
