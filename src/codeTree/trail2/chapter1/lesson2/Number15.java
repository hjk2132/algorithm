package codeTree.trail2.chapter1.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-quadratic-operations-function/submissions?page=1&page_size=20
public class Number15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        calculate(a, o, c);
    }

    public static void calculate(int a, char o, int c) {
        if (o == '+') {
            System.out.println(a + " + " + c + " = " + (a + c));
        } else if (o == '-') {
            System.out.println(a + " - " + c + " = " + (a - c));
        } else if (o == '*') {
            System.out.println(a + " * " + c + " = " + (a * c));
        } else if (o == '/') {
            System.out.println(a + " / " + c + " = " + (a / c));
        } else {
            System.out.println("False");
        }
    }
}
