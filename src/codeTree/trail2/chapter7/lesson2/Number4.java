package codeTree.trail2.chapter7.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-number-based-on-information-2/submissions
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[1001];

        for (int i = 0; i < t; ++i) {
            String str = sc.next();
            int pos = sc.nextInt();

            if (str.equals("S")) {
                arr[pos] = 1;
            } else {
                arr[pos] = 2;
            }
        }

        int count = 0;

        for (int i = a; i <= b; ++i) {
            int d1 = getDistance(arr, i, 1);
            int d2 = getDistance(arr, i, 2);

            if (d1 <= d2) {
                count = count + 1;
            }
        }

        System.out.println(count);
        sc.close();
    }

    public static int getDistance(int[] arr, int i, int str) {
        int distance = 0;

        while(true) {
            int left = Math.max(1, i - distance);
            int right = Math.min(1000, i + distance);

            if (arr[left] == str || arr[right] == str) {
                return distance;
            } else {
                distance = distance + 1;
            }
        }
    }
}
