package codeTree.trail2.chapter8.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-study-cafe-keeping-distance-5/submissions
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int[] seat = new int[n];
        int max = 0;

        for (int i = 0; i < n; ++i) {
            seat[i] = (str.charAt(i) == '0' ? 0 : 1);
        }

        for (int i = 0; i < n; ++i) {
            if (seat[i] == 1) { continue; }

            seat[i] = 1;

            int minDist = Integer.MAX_VALUE;
            int prev = -1;

            for (int j = 0; j < n; ++j) {
                if (seat[j] == 1) {
                    if (prev != -1) {
                        int dist = j - prev;
                        if (dist < minDist) {
                            minDist = dist;
                        }
                    }
                    prev = j;
                }
            }

            if (minDist > max) {
                max = minDist;
            }

            seat[i] = 0;
        }

        System.out.println(max);
        sc.close();
    }
}
