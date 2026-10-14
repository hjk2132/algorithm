package codeTree.trail2.chapter7.lesson1;

import java.util.Scanner;

// url :
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; ++i) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        int totalTime = 0;

        for (int i = 0; i < n; ++i) {
            int min = Integer.MAX_VALUE;
            int max = -1;

            for (int j = 0; j < n; ++j) {
                if (j != i) {
                    // set start
                    if (start[j] < min) { min = start[j]; }
                    // set end
                    if (end[j] > max) { max = end[j]; }
                }
            }

            int tempTime = 0;

            for (int time = min; time < max; ++time) {
                for (int j = 0; j < n; ++j) {
                    boolean isWorking = false;

                    if (j != i) {
                        if (time >= start[j] && time < end[j]) {
                            tempTime = tempTime + 1;
                            isWorking = true;
                        }
                    }

                    if (isWorking) {
                        break;
                    }
                }
            }

            if (tempTime > totalTime) {
                totalTime = tempTime;
            }
        }

        System.out.println(totalTime);
        sc.close();
    }
}
