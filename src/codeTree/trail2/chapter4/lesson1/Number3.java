package codeTree.trail2.chapter4.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-datetime-to-datetime/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int startMins = (11 * 24 * 60) + (11 * 60) + 11;
        int endMins = (a * 24 * 60) + (b * 60) + c;

        int diff = endMins - startMins;

        if (diff < 0) {
            System.out.println(-1);
        } else {
            System.out.println(diff);
        }

        sc.close();
    }
}
