package codeTree.trail2.chapter4.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-convert-to-decimal/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();

        int total = 0;

        for (int i = 0; i < binary.length(); ++i) {
            char c = binary.charAt(i);

            if (c == '1') {
                total = total + (int) Math.pow(2, binary.length() - 1 - i);
            }
        }

        System.out.println(total);
    }
}
