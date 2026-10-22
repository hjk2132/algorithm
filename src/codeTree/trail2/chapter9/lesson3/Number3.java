package codeTree.trail2.chapter9.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-study-cafe-keeping-distance-3/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int[] list = new int[n];
        int answer = 0;

        for (int i = 0; i < n; ++i) {
            if (str.charAt(i) == '0') {
                list[i] = 0;
            } else {
                list[i] = 1;
            }
        }

        for (int i = 0; i < n; ++i) {
            if (list[i] == 1) { continue; }
            int[] copy = new int[n];

            for (int j = 0; j < n; ++j) {
                if (j == i) {
                    copy[j] = 1;
                } else {
                    copy[j] = list[j];
                }
            }

            int min = n;
            int count = 0;

            for (int j = 1; j < n; ++j) {
                count = count + 1;
                if (copy[j] == 1) {
                    if (min > count) {
                        min = count;
                    }
                    count = 0;
                }
            }

            if (answer < min) {
                answer = min;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
