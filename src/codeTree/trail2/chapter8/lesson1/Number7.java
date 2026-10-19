package codeTree.trail2.chapter8.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-length-of-string-that-does-not-appear/submissions
public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int length = Integer.MAX_VALUE;

        for (int i = 1; i <= str.length(); ++i) {
            boolean isTrue = true;

            for (int j = 0; j <= str.length() - i; ++j) {
                String s = str.substring(j, j + i);

                for (int k = j + 1; k <= str.length() - i; ++k) {
                    String v = str.substring(k, k + i);

                    if (s.equals(v)) {
                        isTrue = false;
                        break;
                    }
                }

                if (!isTrue) {
                    break;
                }
            }

            if (isTrue && length > i) {
                length = i;
                break;
            }
        }

        System.out.println(length);
        sc.close();
    }
}
