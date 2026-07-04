package codeTree.trail2.chapter2.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-sum-from-1-to-a-certain-number-2/submissions?page=1&page_size=20
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sum(1, 0, input);
    }

    public static void sum(int count, int sum, int max) {
        if (count >= max) {
            sum = sum + count;

            System.out.println(sum);
        } else {
            sum = sum + count;
            count = count + 1;

            sum(count, sum, max);
        }
    }
}
