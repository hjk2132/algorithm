package codeTree.trail2.chapter2.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-sequence-of-remainder-divided-by-100/description
public class Number15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(recursive(input));
    }

    public static int recursive(int input) {
        if (input == 1) {
            return 2;
        } else if (input == 2) {
            return 4;
        } else {
            return (recursive(input - 1) * recursive(input - 2) % 100);
        }
    }
}
