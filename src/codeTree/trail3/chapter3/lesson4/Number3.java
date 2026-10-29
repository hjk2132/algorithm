package codeTree.trail3.chapter3.lesson4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-implement-radix-sort/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Queue<Integer>[] buckets = new LinkedList[10];

        for (int i = 0; i < 10; ++i) {
            buckets[i] = new LinkedList<>();
        }

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= 6; ++i) {
            int div = (int) Math.pow(10, i - 1);

            for (int j = 0; j < n; ++j) {
                int num = (arr[j] / div) % 10;
                buckets[num].offer(arr[j]);
            }

            int idx = 0;

            for (int k = 0; k < 10; ++k) {
                while (!buckets[k].isEmpty()) {
                    int val = buckets[k].poll();
                    arr[idx] = val;
                    idx = idx + 1;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
