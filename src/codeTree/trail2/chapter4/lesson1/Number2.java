package codeTree.trail2.chapter4.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-date-to-date/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= m1 - 1; ++i) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                sum1 = sum1 + 31;
            } else if (i == 2) {
                sum1 = sum1 + 28;
            } else {
                sum1 = sum1 + 30;
            }
        }
        sum1 = sum1 + d1;


        for (int i = 1; i <= m2 - 1; ++i) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                sum2 = sum2 + 31;
            } else if (i == 2) {
                sum2 = sum2 + 28;
            } else {
                sum2 = sum2 + 30;
            }
        }
        sum2 = sum2 + d2;

        System.out.println(sum2 - sum1 + 1);
        sc.close();
    }
}
