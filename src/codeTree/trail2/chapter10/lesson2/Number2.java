package codeTree.trail2.chapter10.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-rectangle-made-of-two-points/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] box1 = new int[4];
        int[] box2 = new int[4];

        for (int i = 0; i < 4; ++i) {
            box1[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; ++i) {
            box2[i] = sc.nextInt();
        }

        int xMin = Math.min(box1[0], Math.min(box1[2], Math.min(box2[0], box2[2])));
        int xMax = Math.max(box1[0], Math.max(box1[2], Math.max(box2[0], box2[2])));

        int yMin = Math.min(box1[1], Math.min(box1[3], Math.min(box2[1], box2[3])));
        int yMax = Math.max(box1[1], Math.max(box1[3], Math.max(box2[1], box2[3])));

        int xDiff = xMax - xMin;
        int yDiff = yMax - yMin;

        System.out.println(xDiff * yDiff);
        sc.close();
    }
}
