package codeTree.trail2.chapter5.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-continuous-number2/submissions
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxCount = 1;
        int tempCount = 1;
        int beforeNum = -1;

        for (int i = 0; i < n; ++i) {
            int thisNum = sc.nextInt();

            if (beforeNum == thisNum) {
                tempCount = tempCount + 1;

                if (maxCount < tempCount) {
                    maxCount = tempCount;
                }

                continue;
            }

            beforeNum = thisNum;
            tempCount = 1;
        }

        System.out.println(maxCount);
    }
}
