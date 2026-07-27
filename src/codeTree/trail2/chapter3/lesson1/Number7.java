package codeTree.trail2.chapter3.lesson1;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-determine-same-word/submissions?page=1&page_size=20
public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isSame = false;

        if (str1.length() == str2.length()) {
            for (int i = 0; i < arr1.length; ++i) {
                if (arr1[i] != arr2[i]) {
                    isSame = false;
                    break;
                } else {
                    isSame = true;
                }
            }
        }

        if(isSame) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
