package codeTree.trail2.chapter1.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-to-exchange-two-integer-values/description
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int temp = m;

        m = n;
        n = temp;

        System.out.println(n + " " + m);
    }
}
