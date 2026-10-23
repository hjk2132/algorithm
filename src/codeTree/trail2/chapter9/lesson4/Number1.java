package codeTree.trail2.chapter9.lesson4;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-ranking-competition2/submissions
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        // 1 = A, 2 = B, 3 = A & B
        int status = 3;
        int aScore = 0;
        int bScore = 0;

        for (int i = 0; i < n; ++i) {
            String str = sc.next();
            int diff = sc.nextInt();
            int temp = -1;

            if (str.charAt(0) == 'A') {
                aScore = aScore + diff;
            } else {
                bScore = bScore + diff;
            }

            if (aScore > bScore) {
                temp = 1;
            } else if (aScore < bScore) {
                temp = 2;
            } else {
                temp = 3;
            }

            if (status != temp) {
                count = count + 1;
                status = temp;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
