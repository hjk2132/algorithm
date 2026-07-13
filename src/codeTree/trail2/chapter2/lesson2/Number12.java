package codeTree.trail2.chapter2.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-sum-of-large-numeric-digits/description
public class Number12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(recursive(a * b * c));
    }

    public static int recursive(int input) {
        if (input < 10) {
            return input;
        }

        return (input % 10) + recursive(input / 10);
    }
}
