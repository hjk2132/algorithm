package codeTree.trail2.chapter1.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-sum-from-1-to-a-certain-number/submissions?page=1&page_size=20
public class Number1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int sum = 1;

        for (int i = 2; i <= n; ++i) {
            sum = sum + i;
        }

        System.out.println(sum / 10);
    }
}
