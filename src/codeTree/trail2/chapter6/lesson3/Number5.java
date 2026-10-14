package codeTree.trail2.chapter6.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-ability-of-developer-2/submissions
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int sum = 0;

        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    for (int l = k + 1; l < 6; l++) {
                        if (k == i || k == j || l == i || l == j) continue;

                        int team1 = arr[i] + arr[j];
                        int team2 = arr[k] + arr[l];
                        int team3 = sum - team1 - team2;

                        int min = Math.min(team1, Math.min(team2, team3));
                        int max = Math.max(team1, Math.max(team2, team3));

                        answer = Math.min(answer, max - min);
                    }
                }
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
