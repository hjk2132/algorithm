package codeTree.trail2.chapter7.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-find-the-number-of-palindrome/submissions
public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;

        for (int i = x; i <= y; ++i) {
            String str = Integer.toString(i);
            int half = (i % 2 == 0) ? (str.length() / 2 - 1) : (str.length() / 2);
            boolean isPalindrome = true;

            for (int j = 0; j <= half; ++j) {
                if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                count = count + 1;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
