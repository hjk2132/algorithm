package codeTree.trail2.chapter1.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-decimal-decisions-using-functions/description
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for (int i = a; i <= b; ++i) {
            sum = sum + isPrime(i);
        }

        System.out.println(sum);
    }

    public static int isPrime(int input) {
        if (input < 2) {
            return 0;
        } else {
            boolean isAdd = false;

            for (int i = 2; i < input; ++i) {
                if (input % i == 0) {
                    isAdd = true;
                    break;
                }
            }

            if (isAdd == false) {
                return input;
            } else {
                return 0;
            }
        }
    }
}
