package codeTree.trail2.chapter1.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-to-determine-whether-a-continuous-subsequence-is-made-using-a-function/description
public class Number19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        boolean isYes = false;

        for (int i = 0; i < a.length; ++i) {
            if(isContinue(a, b, i)) {
                System.out.println("Yes");
                isYes = true;
                break;
            };
        }

        if(!isYes) {
            System.out.println("No");
        }

    }

    public static boolean isContinue(int[] a, int[] b, int startIndex) {
        if (a.length - startIndex < b.length) {
            return false;
        } else {
            for (int i = startIndex; i < startIndex + b.length; ++i) {
                if (a[i] != b[i - startIndex]) {
                    return false;
                }
            }
        }
        return true;
    }
}
