package codeTree.trail2.chapter1.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-use-functions-to-determine-sums-and-decimals/submissions?page=1&page_size=20
public class Number17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        for (int i = a; i <= b; ++i) {
            if(isPrimeNumber(i) && isSumEven(i)) {
                count = count + 1;
            }
        }

        System.out.println(count);
    }

    public static boolean isPrimeNumber(int input) {
        for (int i = 2; i < input; ++i) {
            if (input % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSumEven(int input) {
        int sum = 0;

        while (input > 0) {
            sum = sum + (input) % 10;
            input = input / 10;
        }

        if (sum % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
