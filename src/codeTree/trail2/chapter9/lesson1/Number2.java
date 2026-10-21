package codeTree.trail2.chapter9.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-two-rectangles/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] box1 = new int[4][2];
        int[][] box2 = new int[4][2];

        for (int i = 0; i < 2; ++i) {
            box1[i][0] = sc.nextInt();
            box1[i][1] = sc.nextInt();
        }
        box1[2][0] = box1[1][0]; box1[2][1] = box1[0][1];
        box1[3][0] = box1[0][0]; box1[3][1] = box1[1][1];

        for (int i = 0; i < 2; ++i) {
            box2[i][0] = sc.nextInt();
            box2[i][1] = sc.nextInt();
        }
        box2[2][0] = box2[1][0]; box2[2][1] = box2[0][1];
        box2[3][0] = box2[0][0]; box2[3][1] = box2[1][1];

        boolean isOverlap = false;

        if (Math.max(box1[0][0], box2[0][0]) <= Math.min(box1[1][0], box2[1][0]) &&
                Math.max(box1[0][1], box2[0][1]) <= Math.min(box1[1][1], box2[1][1])) {
            isOverlap = true;
        }

        if (isOverlap) {
            System.out.println("overlapping");
        } else {
            System.out.println("nonoverlapping");
        }
        sc.close();
    }
}
