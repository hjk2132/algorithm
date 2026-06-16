package codeTree.trail2.chapter1.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-that-season-that-day/description
public class Number21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (!isLeapYear(y)) {
            if (isValid(y, m, d)) {
                System.out.println(getSeason(m));
            } else {
                System.out.println(-1);
            }
        }

        if (isLeapYear(y)) {
            if (isValid(y, m, d)) {
                System.out.println(getSeason(m));
            } else {
                System.out.println(-1);
            }
        }
    }

    public static boolean isLeapYear(int y) {
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean isValid(int y, int m, int d) {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d >= 1 && d <= 31) {
                return true;
            } else {
                return false;
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11 || m == 12) {
            if (d >= 1 && d <= 30) {
                return true;
            } else {
                return false;
            }
        } else if (m == 2) {
            if (isLeapYear(y)) {
                if (d >= 1 && d<= 29) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if (d >= 1 && d<= 28) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    public static String getSeason(int m) {
        if (m >= 3 && m <= 5) {
            return "Spring";
        } else if (m >= 6 && m <= 8) {
            return "Summer";
        } else if (m >= 9 && m <= 11) {
            return "Fall";
        } else if (m == 12 || m == 1 || m == 2) {
            return "Winter";
        } else {
            return "-1";
        }
    }
}
