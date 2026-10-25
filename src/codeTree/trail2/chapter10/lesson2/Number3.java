package codeTree.trail2.chapter10.lesson2;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-find-a-b-c-d/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[15];

        for (int i = 0; i < 15; ++i) {
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);

        int a = list[0];
        int b = list[1];
        int c = list[2];
        int d = list[14] - a - b - c;

        System.out.print(a + " " + b + " " + c + " " + d);
        sc.close();
    }
}
