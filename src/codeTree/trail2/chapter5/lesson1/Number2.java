package codeTree.trail2.chapter5.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-continuous-number3/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxCount = 1;
        int tempCount = 1;
        int lastNum = 0;

        for (int i = 0; i < n; ++i) {
            int thisNum = sc.nextInt();

            if (lastNum * thisNum > 0) {
                tempCount = tempCount + 1;
                lastNum = thisNum;

                if (maxCount < tempCount) {
                    maxCount = tempCount;
                }

                continue;
            }

            tempCount = 1;
            lastNum = thisNum;
        }

        System.out.println(maxCount);
        sc.close();
    }
}
