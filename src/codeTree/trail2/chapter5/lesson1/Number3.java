package codeTree.trail2.chapter5.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-continuous-number4/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int tempGrow = 1;
        int maxGrow = 1;
        int beforeNum = 2000;

        for (int i = 0; i < n; ++i) {
            int num = sc.nextInt();

            if (beforeNum < num) {
                tempGrow = tempGrow + 1;

                if (maxGrow < tempGrow) {
                    maxGrow = tempGrow;
                }

                beforeNum = num;
                continue;
            }

            tempGrow = 1;
            beforeNum = num;
        }

        System.out.println(maxGrow);
        sc.close();
    }
}
