package codeTree.trail2.chapter6.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-the-capabilities-of-the-development-team/submissions
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; ++i) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < 5; ++i) {
            for (int j = i + 1; j < 5; ++j) {
                for (int k = 0; k < 5; ++k) {
                    for (int l = k + 1; l < 5; ++l) {
                        if (k == i || k == j || l == i || l == j) { continue; }

                        int team1 = arr[i] + arr[j];
                        int team2 = arr[k] + arr[l];
                        int team3 = sum - team1 - team2;

                        if (team1 == team2 || team2 == team3 || team1 == team3) {
                            continue;
                        }

                        int min = Math.min(team1, Math.min(team2, team3));
                        int max = Math.max(team1, Math.max(team2, team3));
                        int diff = max - min;

                        if (diff < answer) {
                            answer = diff;
                        }
                    }
                }
            }
        }

        if (answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
        sc.close();
    }
}
