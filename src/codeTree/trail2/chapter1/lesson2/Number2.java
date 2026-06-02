package codeTree.trail2.chapter1.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-minimum-value-of-an-integer/submissions?page=1&page_size=20
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (b < c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        } else {
            if (a < c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        }
    }
}
