package codeTree.trail2.chapter10.lesson2;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-finding-a-b-c/submissions
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[7];

        for (int i = 0; i < 7; ++i) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int a = list[0];
        int b = list[1];
        int c = -1;

        if (list[2] == a + b) {
            c = list[3];
        } else {
            c = list[2];
        }

        System.out.print(a + " " + b + " " + c);
        sc.close();
    }
}
