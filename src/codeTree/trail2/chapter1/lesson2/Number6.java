package codeTree.trail2.chapter1.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-tell-the-function-using-a-leap-year/submissions?page=1&page_size=20
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if (isLeapYear(input)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean isLeapYear(int input) {
        if (input % 4 == 0) {
            if (input % 100 == 0 && input % 400 != 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
