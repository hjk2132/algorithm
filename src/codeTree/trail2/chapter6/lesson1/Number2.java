package codeTree.trail2.chapter6.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-pair-parentheses-3/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int count = 0;

        for (int i = 0; i < str.length(); ++i) {
            String s1 = str.substring(i, i+1);

            for (int j = i + 1; j < str.length(); ++j) {
                String s2 = str.substring(j, j+1);

                if (s1.equals("(") && s2.equals(")")) {
                    count = count + 1;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
