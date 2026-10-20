package codeTree.trail2.chapter8.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-strange-bomb-3/submissions
public class Number9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] list = new int[n];
        int[] count = new int[1000005];
        boolean[] iExploded = new boolean[n];

        for (int i = 0; i < n; ++i) {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (list[i] == list[j] && (int) Math.abs(j-i) <= k) {
                    iExploded[i] = true;
                    iExploded[j] = true;
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            if(iExploded[i]) {
                count[list[i]] = count[list[i]] + 1;
            }
        }

        int max = 1;
        int index = 0;

        for (int i = 0; i < 1000005; ++i) {
            if (count[i] >= max) {
                max = count[i];
                index = i;
            }
        }

        System.out.println(index);
        sc.close();
    }
}
