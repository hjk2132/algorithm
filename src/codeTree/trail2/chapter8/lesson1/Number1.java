package codeTree.trail2.chapter8.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-ya-rock/submissions
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[4];
        int[][] order = new int[n][3];

        for (int i = 0; i < n; ++i) {
            order[i][0] = sc.nextInt();
            order[i][1] = sc.nextInt();
            order[i][2] = sc.nextInt();
        }

        int answer = 0;

        for (int i = 1; i <= 3; ++i) {
            int[] copy = new int[4];
            copy[i] = 1;

            int score = getScore(copy, order);

            if (score > answer) {
                answer = score;
            }
        }

        System.out.println(answer);
        sc.close();
    }

    public static int getScore(int[] arr, int[][] order) {
        int length = order.length;
        int score = 0;

        for (int i = 0; i < length; ++i) {
            int first = order[i][0];
            int second = order[i][1];
            int check = order[i][2];

            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;

            if (arr[check] == 1) {
                score = score + 1;
            }
        }

        return score;
    }
}
