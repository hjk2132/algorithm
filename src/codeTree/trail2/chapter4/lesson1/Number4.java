package codeTree.trail2.chapter4.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-guess-day-of-week/description
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int leftDays = 0;
        boolean isPast = false;

        if (m1 > m2 || (m1 == m2 && d1 > d2)) {
            isPast = true;
            int tempM = m1; m1 = m2; m2 = tempM;
            int tempD = d1; d1 = d2; d2 = tempD;
        }

        for (int i = m1; i <= m2; ++i) {
            if (m1 == m2) {
                leftDays = d2 - d1;
                break;
            }

            if (i == m1) {
                leftDays = leftDays + getDays(m1) - d1;
            } else if (i == m2) {
                leftDays = leftDays + d2;
            } else {
                leftDays = leftDays + getDays(i);
            }
        }

        if (isPast) {
            leftDays = -leftDays;
        }

        System.out.println(getDayOfWeek(leftDays));
        sc.close();
    }

    public static int getDays(int month) {
        if (month == 2) {
            return 28;
        } else if (month == 1 || month == 3 || month == 5
                || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 0;
        }
    }

    public static String getDayOfWeek(int leftDays) {
        int modulo = ((leftDays % 7) + 7) % 7;

        if (modulo == 0) {
            return "Mon";
        } else if (modulo == 1) {
            return "Tue";
        } else if (modulo == 2) {
            return "Wed";
        } else if (modulo == 3) {
            return "Thu";
        } else if (modulo == 4) {
            return "Fri";
        } else if (modulo == 5) {
            return "Sat";
        } else {
            return "Sun";
        }
    }
}
