package codeTree.trail2.chapter10.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-moving-block/submissions
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        int sum = 0;
        int answer = 0;

        for (int i = 0; i < n; ++i) {
            list[i] = sc.nextInt();
            sum = sum + list[i];
        }

        int avg = sum / n;

        for (int i = 0; i < n; ++i) {
            if (list[i] > avg) {
                int diff = list[i] - avg;
                answer = answer + diff;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
