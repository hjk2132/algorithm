package codeTree.trail2.chapter9.lesson4;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-location-of-the-second-smallest-number/submissions
public class Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        int[] copy = new int[n];

        for (int i = 0; i < n; ++i) {
            list[i] = sc.nextInt();
            copy[i] = list[i];
        }

        Arrays.sort(copy);

        boolean isDuplicated = true;
        boolean isMinus = false;
        int min = copy[0];
        int second = 0;
        int answer = 0;

        for (int i = 0; i < n; ++i) {
            if (copy[i] > min && second == 0) {
                isDuplicated = false;
                second = copy[i];
            } else if (copy[i] == second) {
                isMinus = true;
                break;
            } else if (copy[i] != min) {
                isDuplicated = false;
            }
        }

        for (int i = 0; i < n; ++i) {
            if (list[i] == second) {
                answer = i + 1;
                break;
            }
        }

        if (isDuplicated || isMinus) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }

        sc.close();
    }
}
