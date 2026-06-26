package codeTree.trail2.chapter1.lesson4;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-find-the-location-of-a-substring-using-a-function/description
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        String m = sc.next();

        System.out.println(getStartIndex(n, m));
    }

    public static int getStartIndex(String n, String m) {
        int startIndex = n.indexOf(m);

        return startIndex;
    }
}
