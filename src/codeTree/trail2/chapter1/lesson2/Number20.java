package codeTree.trail2.chapter1.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-with-or-without-2021/description
public class Number20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (isValid(m, d)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean isValid(int m, int d) {
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
            if (d >= 1 && d <= 28) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
