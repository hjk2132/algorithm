package codeTree.trail2.chapter9.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-teleportation/submissions
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int type1 = Math.abs(b - a);
        int type2 = Math.abs(a - x) + Math.abs(b - y);
        int type3 = Math.abs(a - y) + Math.abs(b - x);

        int min = Math.min(type1, type2);
        min = Math.min(min, type3);

        System.out.println(min);
        sc.close();
    }
}
