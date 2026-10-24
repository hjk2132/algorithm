package codeTree.trail2.chapter9.lesson4;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-ranking-competition/submissions
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 0 : A, 1 : B, 2 : C, 3 : AB, 4 : AC, 5 : BC, 6 : ABC
        int status = 6;
        int count = 0;
        int[] scoreList = new int[3];

        for (int i = 0; i < n; ++i) {
            String str = sc.next();
            int score = sc.nextInt();
            int index = -1;
            int tempStatus = -1;

            if (str.charAt(0) == 'A') {
                index = 0;
            } else if (str.charAt(0) == 'B') {
                index = 1;
            } else {
                index = 2;
            }

            scoreList[index] = scoreList[index] + score;
            int max = Math.max(scoreList[0], Math.max(scoreList[1], scoreList[2]));

            if (scoreList[0] == max && scoreList[1] == max && scoreList[2] == max) {
                tempStatus = 6;
            } else if (scoreList[0] == max && scoreList[1] == max) {
                tempStatus = 3;
            } else if (scoreList[0] == max && scoreList[2] == max) {
                tempStatus = 4;
            } else if (scoreList[1] == max && scoreList[2] == max) {
                tempStatus = 5;
            } else if (scoreList[0] == max) {
                tempStatus = 0;
            } else if (scoreList[1] == max) {
                tempStatus = 1;
            } else if (scoreList[2] == max) {
                tempStatus = 2;
            }

            if (tempStatus != status) {
                count = count + 1;
                status = tempStatus;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
