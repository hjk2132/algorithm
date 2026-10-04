package codeTree.trail2.chapter5.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-who-will-pay/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] students = new int[n];
        boolean isDetected = false;

        for (int i = 0; i < m; ++i) {
            int index = sc.nextInt() - 1;
            students[index] = students[index] + 1;

            if (students[index] >= k) {
                System.out.println(index + 1);
                isDetected = true;
                break;
            }
        }

        if (isDetected == false) {
            System.out.println(-1);
        }
        sc.close();
    }
}
