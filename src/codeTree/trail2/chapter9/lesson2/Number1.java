package codeTree.trail2.chapter9.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-pigeons-and-electric-cords/submissions
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start, pos, count
        int[][] status = new int[11][3];
        int n = sc.nextInt();
        int answer = 0;

        for (int i = 0; i < n; ++i) {
            int bird = sc.nextInt();
            int pos = sc.nextInt() + 1;

            if (status[bird][0] == 0) {
                status[bird][0] = 1;
                status[bird][1] = pos;
            } else if (status[bird][0] == 1 && status[bird][1] != pos) {
                status[bird][1] = pos;
                status[bird][2] = status[bird][2] + 1;
            } else if (status[bird][0] == 1 && status[bird][1] == pos) {
                continue;
            }
        }

        for (int i = 0; i < 11; ++i) {
            answer = answer + status[i][2];
        }

        System.out.println(answer);
        sc.close();
    }
}
