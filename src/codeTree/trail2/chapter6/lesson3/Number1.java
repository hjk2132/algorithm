package codeTree.trail2.chapter6.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-one-way-lock/description
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[3];

        for (int i = 0; i < 3; ++i) {
            arr[i] = sc.nextInt();
        }

        int impA = 0;
        int impB = 0;
        int impC = 0;

        for (int i = 1; i <= n; ++i) {
            int aDiff = Math.abs(arr[0] - i);
            int bDiff = Math.abs(arr[1] - i);
            int cDiff = Math.abs(arr[2] - i);

            if (aDiff > 2) {
                impA = impA + 1;
            }

            if (bDiff > 2) {
                impB = impB + 1;
            }

            if (cDiff > 2) {
                impC = impC + 1;
            }
        }

        int total = (int) Math.pow(n, 3);
        total = total - (impA * impB * impC);

        System.out.println(total);
        sc.close();
    }
}
