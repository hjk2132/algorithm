package codeTree.trail2.chapter1.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-find-the-greatest-common-divisor/submissions?page=1&page_size=20
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int minNum = 0;
        int answer = 1;

        if (n < m) {
            minNum = n;
        } else {
            minNum = m;
        }

        for (int i = 1; i <= minNum; ++i) {
            if (n % i == 0 && m % i ==0) {
                answer = i;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
