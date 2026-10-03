package codeTree.trail2.chapter5.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-subsequence-above-t/submissions
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int tempCount = 0;
        int maxCount = 0;

        for (int i = 0; i < n; ++i) {
            int input = sc.nextInt();

            if (input > t) {
                tempCount = tempCount + 1;

                if (tempCount > maxCount) {
                    maxCount = tempCount;
                }
                continue;
            }

            tempCount = 0;;
        }

        System.out.println(maxCount);
    }
}
