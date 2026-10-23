package codeTree.trail2.chapter9.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-developers-rock-paper-scissors/submissions
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; ++i) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int score = 0;

        for (int dir = 0; dir < 2; ++dir) {
            for (int i = 0; i < 3; ++i) {
                int rock = (i + 3) % 3 + 1;
                int scissors = (dir == 0) ? (i + 1) % 3 + 1 : (i + 2) % 3 + 1;
                int paper = (dir == 0) ? (i + 2) % 3 + 1 : (i + 1) % 3 + 1;

                int temp = 0;

                for (int j = 0; j < n; ++j) {
                    int a = arr[j][0];
                    int b = arr[j][1];

                    if (a == rock && b == scissors ||
                            a == scissors && b == paper ||
                            a == paper && b == rock)
                    {
                        temp = temp + 1;
                    }
                }

                if (temp > score) {
                    score = temp;
                }
            }
        }
        System.out.println(score);
        sc.close();
    }
}
