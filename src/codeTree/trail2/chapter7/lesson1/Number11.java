package codeTree.trail2.chapter7.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-the-grace-form-teacher-3/submissions
public class Number11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[][] price = new int[n][2];

        // Input
        for (int i = 0; i < n; ++i) {
            price[i][0] = sc.nextInt();
            price[i][1] = sc.nextInt();
        }

        // Sort
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int totalA = price[i][0] + price[i][1];
                int totalB = price[j][0] + price[j][1];

                if (totalA > totalB) {
                    int tPrice = price[i][0];
                    int tDelivery = price[i][1];

                    price[i][0] = price[j][0];
                    price[i][1] = price[j][1];

                    price[j][0] = tPrice;
                    price[j][1] = tDelivery;
                }
            }
        }

        int maxCount = 0;

        for (int i = 0; i < n; ++i) {
            int budget = b;
            int count = 0;

            if (budget < price[i][0] / 2 + price[i][1]) { continue; }

            budget = budget - (price[i][0] / 2 + price[i][1]);
            count = 1;

            for (int j = 0; j < n; ++j) {
                if (j == i) { continue; }

                if (budget >= (price[j][0] + price[j][1])) {
                    budget = budget - (price[j][0] + price[j][1]);
                    count = count + 1;
                } else {
                    break;
                }
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println(maxCount);
        sc.close();
    }
}
