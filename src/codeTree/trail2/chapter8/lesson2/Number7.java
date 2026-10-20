package codeTree.trail2.chapter8.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-study-cafe-keeping-distance-4/submissions
public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        String str = sc.next();
        int max = -1;

        for (int i = 0; i < n; ++i) {
            if (str.charAt(i) == '0') {
                list[i] = 0;
            } else {
                list[i] = 1;
            }
        }

        for (int i = 0; i < n; ++i) {
            if (list[i] == 1) { continue; }

            for (int j = i + 1; j < n; ++j) {
                if (list[j] == 1) { continue; }

                int[] copy = new int[n];
                for (int k = 0; k < n; ++k) {
                    copy[k] = list[k];
                }
                copy[i] = 1;
                copy[j] = 1;

                int before = -1;
                int count = 0;
                int min = Integer.MAX_VALUE;

                for (int k = 0; k < n; ++k) {
                    if (before == -1) {
                        if (copy[k] == 1) {
                            before = 1;
                        }
                    } else if (before == 1 && copy[k] == 1) {
                        count = 1;
                        if (count < min) {
                            min = count;
                        }
                        before = 1;
                    } else if (before == 1 && copy[k] == 0) {
                        before = copy[k];
                        count = 1;
                    } else if (before == 0 && copy[k] == 0) {
                        before = copy[k];
                        count = count + 1;
                    } else if (before == 0 && copy[k] == 1) {
                        before = copy[k];
                        count = count + 1;
                        if (count < min) {
                            min = count;
                        }
                        count = 0;
                    }
                }

                if (min > max) {
                    max = min;
                }
            }
        }

        System.out.println(max);
        sc.close();
    }
}
