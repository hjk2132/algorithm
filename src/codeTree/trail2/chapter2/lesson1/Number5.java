package codeTree.trail2.chapter2.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-the-flower-of-the-recursive-function/submissions?page=1&page_size=20
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printDown(n, 1);
        printUp(1, n);
    }

    public static void printDown(int n, int min) {
        if (n < 1) {
            return;
        } else {
            System.out.print(n + " ");
            printDown(n - 1, min);
        }
    }

    public static void printUp(int n, int max) {
        if (n > max) {
            return;
        } else {
            System.out.print(n + " ");
            printUp(n + 1, max);
        }
    }
}
