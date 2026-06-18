package codeTree.trail2.chapter1.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-determine-whether-palindrome-is-present/submissions?page=1&page_size=20
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if (isPalindrome(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean isPalindrome(String input) {
        int length = input.length();
        boolean isPalindrome = true;

        for (int i = 0; i < (input.length() / 2) - 1; ++i) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}
