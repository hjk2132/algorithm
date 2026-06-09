package codeTree.trail2.chapter1.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-two-numbers-of-squares/submissions?page=1&page_size=20
public class Number12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(getAnswer(a, b));
    }

    public static int getAnswer(int a, int b) {
        int result = a;

        if (b == 0) {
            return 1;
        } else {
            for (int i = 1; i < b; ++i) {
                result = result * a;
            }
            return result;
        }
    }
}
