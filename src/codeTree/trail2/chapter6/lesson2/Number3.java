package codeTree.trail2.chapter6.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-elemental-mean-value-for-a-particular-interval/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int total = n;

        for (int num = 2; num <= n; ++num) {
            for (int i = 0; i < n - num + 1; ++i) {
                // 개수에 따라서 배열 첫번째 부터 합산
                int tempSum = 0;

                for (int j = i; j < i + num; ++j) {
                    tempSum = tempSum + arr[j];
                }

                // 평균 계산
                double avg = tempSum / (double) num;

                // 평균이 배열에 존재하는지
                for (int j = i; j < i + num; ++j) {
                    if (avg == (double) arr[j]) {
                        total = total + 1;
                        break;
                    }
                }
            }
        }

        System.out.println(total);
        sc.close();
    }
}
