package codeTree.trail2.chapter6.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-candy-in-the-basket-2/submissions?page=1&page_size=20
public class Number5 {
    public static final int RANGE = 105;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[RANGE];

        // 위치별 전체 개수 채우기
        for (int i = 0; i < n; ++i) {
            int num = sc.nextInt();
            int index = sc.nextInt();
            arr[index] = arr[index] + num;
        }

        // 최대 개수
        int max = 0;

        // 구간별 순회하며 최대 값 파악
        for (int i = 0; i < RANGE; ++i) {
            int start = Math.max(0, i-k);
            int end = Math.min(RANGE-1, i+k);

            // System.out.println("\n==== start, end / " + start + " " + end + " ====");

            int sum = 0;

            for (int j = start; j <= end; ++j) {
                sum = sum + arr[j];
                // System.out.println("j, num, total = " + j + " " + arr[j] + " " + sum);
            }

            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
        sc.close();
    }
}
