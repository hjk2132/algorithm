package codeTree.trail2.chapter2.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-square-of-each-digit/description
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        sumSqure(input, 0);
    }

    public static void sumSqure(int next, int sum) {
        if (next < 10) {
            sum = sum + (next * next);
            System.out.println(sum);
        } else {
            int add = next % 10;
            sum = sum + (add * add);
            next = next / 10;

            sumSqure(next, sum);
        }
    }
}
