package codeTree.trail2.chapter9.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-coding-talk/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int[][] record = new int[m][2];

        for (int i = 0; i < m; ++i) {
            char people = sc.next().charAt(0);
            int count = sc.nextInt();

            record[i][0] = people - 'A';
            record[i][1] = count;
        }

        if (record[p - 1][1] == 0) {
            System.out.println();
        } else {
            boolean[] isRead = new boolean[n];
            String answer = "";

            for (int i = 0; i < m; ++i) {
                int people = record[i][0];
                int unRead = record[i][1];

                if (i >= p - 1 || unRead == record[p - 1][1]) {
                    isRead[people] = true;
                }
            }

            for (int i = 0; i < n; ++i) {
                if (!isRead[i]) {
                    answer = answer + String.valueOf((char)('A' + i)) + " ";
                }
            }

            System.out.println(answer);
        }
        sc.close();
    }
}
