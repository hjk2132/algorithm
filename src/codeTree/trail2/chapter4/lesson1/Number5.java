package codeTree.trail2.chapter4.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-the-day-of-the-day/submissions
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();

        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int day = 100;

        for (int i = 0; i < days.length; ++i) {
            if (A.equals(days[i])) {
                day = i;
                break;
            }
        }

        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int leftDays = 0;

        for (int i = m1; i <= m2; ++i) {
            if (m1 == m2) {
                leftDays = d2 - d1;
                break;
            }

            if (i == m1) {
                leftDays = leftDays + months[i-1] - d1;
            } else if (i == m2) {
                leftDays = leftDays + d2;
            } else {
                leftDays = leftDays + months[i-1];
            }
        }

        int modulo = leftDays % 7;

        if (modulo >= day) {
            System.out.println(leftDays / 7 + 1);
        } else {
            System.out.println(leftDays / 7);
        }
    }
}
