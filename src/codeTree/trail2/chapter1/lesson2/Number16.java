package codeTree.trail2.chapter1.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-determining-the-whole-number-using-a-function/submissions?page=1&page_size=20
public class Number16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(countFull(a, b));
    }

    public static int countFull(int a, int b) {
        int count = 0;

        for (int i = a; i <= b; ++i) {
            if (isCount(i)) {
                count = count + 1;
            }
        }

        return count;
    }

    public static boolean isCount(int input) {
        if (input % 2 == 0) {
            return false;
        }

        if ((input % 3 == 0) && (input % 9 != 0)) {
            return false;
        }

        if (input % 10 == 5) {
            return false;
        }

        return true;
    }
}
