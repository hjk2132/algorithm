package codeTree.trail2.chapter2.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-a-strange-sequence/description
public class Number18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(recursive(n));
    }

    public static int recursive(int input) {
        if (input == 1) {
            return 1;
        } else if (input == 2) {
            return 2;
        } else {
            return (recursive(input / 3) + recursive(input - 1));
        }
    }
}
