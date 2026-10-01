package codeTree.trail2.chapter4.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-strange-flipping-tiles/submissions
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int position = 100000;

        // 0 = none, 1 = white, 2 = black
        int[] array = new int[200001];
        // 0 = none, 1 = white, 2 = black
        int[] answer= new int[3];


        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            String direction = sc.next();

            if (direction.equals("L")) {
                for (int j = 0; j < x; ++j) {
                    array[position] = 1;

                    if (j < x - 1) {
                        position = position - 1;
                    }
                }
            } else if (direction.equals("R")) {
                for (int j = 0; j < x; ++j) {
                    array[position] = 2;

                    if (j < x - 1) {
                        position = position + 1;
                    }
                }
            } else {
                continue;
            }
        }

        for (int i = 0; i < 200001; ++i) {
            if (array[i] == 0) {
                answer[0] = answer[0] + 1;
            } else if (array[i] == 1) {
                answer[1] = answer[1] + 1;
            } else if (array[i] == 2) {
                answer[2] = answer[2] + 1;
            } else {
                continue;
            }
        }

        System.out.println(answer[1] + " " + answer[2]);
        sc.close();
    }
}
