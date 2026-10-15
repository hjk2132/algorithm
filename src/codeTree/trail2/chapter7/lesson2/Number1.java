package codeTree.trail2.chapter7.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-maximum-of-sum-of-numbers/submissions
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int max = 0;

        for (int i = x; i <= y; ++i) {
            int sum = 0;
            int num = i;

            while(num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }

            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
        sc.close();
    }
}
