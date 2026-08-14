package codeTree.trail2.chapter4.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-time-to-time/description
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] info = new int[4];

        for (int i = 0; i < 4; ++i) {
            info[i] = sc.nextInt();
        }

        int start = 60 * info[0] + info[1];
        int end = 60 * info[2] + info[3];

        System.out.println(end - start);
    }
}
