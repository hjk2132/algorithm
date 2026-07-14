package codeTree.trail2.chapter2.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-3n-plus-1-sequence-with-recursive-function/description
public class Number14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(recursive(n, 0));
    }

    public static int recursive(int input, int count) {
        if (input == 1) {
            return count;
        } else {
            if (input % 2 == 0) {
                input = input / 2;
                count = count + 1;

                return recursive(input, count);
            } else {
                input = input * 3 + 1;
                count = count + 1;

                return recursive(input, count);
            }
        }
    }
}
