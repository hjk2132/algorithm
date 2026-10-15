package codeTree.trail2.chapter7.lesson1;

import java.util.Scanner;

public class Number9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int maxNum = -1;

        for (int i = 0; i < n; ++i) {
            int bomb = arr[i];
            int distance = 1;

            for (int j = i + 1; j < n; ++j) {
                if (arr[j] == bomb) {
                    if (distance <= k) {
                        // System.out.println("i, j = " + i + " " + j);
                        // System.out.println("a, b = " + arr[i] + " " + arr[j]);

                        if (arr[j] > maxNum) {
                            maxNum = arr[j];
                            break;
                        }
                    }
                } else {
                    distance = distance + 1;
                }
            }
        }

        System.out.println(maxNum);
        sc.close();
    }
}
