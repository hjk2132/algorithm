package codeTree.trail2.chapter8.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-create-a-specific-number-using-multiple-numbers/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int aCount = c / a;
        int bCount = c / b;

        int answer = 0;

        for (int i = 0; i <= aCount; ++i) {
            for (int j = 0; j <= bCount; ++j) {
                int sum = a * i + b * j;

                if (sum <= c && answer < sum) {
                    answer = sum;
                }
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
