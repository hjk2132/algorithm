package codeTree.trail2.chapter9.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-two-lines/submissions
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();

        if (x2 >= x3 && x2 <= x4) {
            System.out.println("intersecting");
        } else if (x4 >= x1 && x4 <= x2) {
            System.out.println("intersecting");
        } else {
            System.out.println("nonintersecting");
        }
        sc.close();
    }
}
