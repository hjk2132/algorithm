package codeTree.trail2.chapter6.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-escaping-carry-2/submissions
public class Number12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = -1;

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                for (int k = j + 1; k < n; ++k) {
                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];

                    int carry = isCarry(a, b , c);

                    if (carry > max) {
                        max = carry;
                    }
                }
            }
        }

        System.out.println(max);
        sc.close();
    }

    public static int isCarry(int a, int b, int c) {
        int[] aArr = new int [5];
        int[] bArr = new int [5];
        int[] cArr = new int [5];
        int index = 0;

        while (a > 0 || b > 0 || c > 0) {
            aArr[index] = a % 10;
            bArr[index] = b % 10;
            cArr[index] = c % 10;

            a = a / 10;
            b = b / 10;
            c = c / 10;

            index = index + 1;
        }

        for (int i = 0; i < 5; ++i) {
            int sum = aArr[i] + bArr[i] + cArr[i];

            if (sum >= 10) {
                return -1;
            }
        }

        int totalSum = 0;

        for (int i = 0; i < 5; ++i) {
            int iSum = aArr[i] + bArr[i] + cArr[i];
            totalSum = totalSum + iSum * (int) Math.pow(10, i);
        }

        return totalSum;
    }
}
