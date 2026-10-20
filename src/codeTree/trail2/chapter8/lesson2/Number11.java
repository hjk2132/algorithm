package codeTree.trail2.chapter8.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-divide-sections-well/submissions
public class Number11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int answer = -1;

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= 10000; ++i) {
            boolean isPassed = true;
            int count = 1;
            int sum = 0;

            for (int j = 0; j < n; ++j) {
                if (sum + arr[j] > i) {
                    if (count + 1 > m) {
                        isPassed = false;
                        break;
                    } else {
                        if (arr[j] <= i) {
                            count = count + 1;
                            sum = 0;
                            sum = sum + arr[j];
                        } else {
                            isPassed = false;
                            break;
                        }
                    }
                } else {
                    sum = sum + arr[j];
                }
            }

            if (isPassed) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
