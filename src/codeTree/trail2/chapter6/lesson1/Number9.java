package codeTree.trail2.chapter6.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-pair-parentheses-2/submissions
public class Number9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] start = new int[str.length()];
        int[] end = new int[str.length()];

        for (int i = 0; i < str.length() - 1; ++i) {
            String now = str.substring(i, i+1);
            String next = str.substring(i+1, i+2);

            if (now.equals(next)) {
                if (now.equals("(")) {
                    start[i] = 1;
                } else {
                    end[i] = 1;
                }
            }
        }

        int totalCount = 0;

        for (int i = 0; i < str.length(); ++i) {
            if (start[i] == 1) {
                for (int j = i + 1; j < str.length(); ++j) {
                    if (end[j] == 1) {
                        totalCount = totalCount + 1;

                        // System.out.println("i, j = " + i + " " + j + " / count = " + totalCount);
                    }
                }
            }
        }

        System.out.println(totalCount);
        sc.close();
    }
}
