package codeTree.trail2.chapter5.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-correlation-between-shaking-hands-and-infectious-diseases2/description
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt() - 1;
        int t = sc.nextInt();

        int[] developers = new int[n];
        boolean[] isInfected = new boolean[n];
        int[] leftCount = new int[n];

        isInfected[p] = true;
        leftCount[p] = k;

        int[][] timeLine = new int[251][2];
        boolean[] hasHandshake = new boolean[251];

        for (int i = 0; i < t; ++i) {
            int time = sc.nextInt();
            int personA = sc.nextInt() - 1;
            int personB = sc.nextInt() - 1;

            timeLine[time][0] = personA;
            timeLine[time][1] = personB;
            hasHandshake[time] = true;
        }

        for (int i = 0; i < 251; ++i) {
            if (hasHandshake[i] == false) {
                continue;
            }

            int personA = timeLine[i][0];
            int personB = timeLine[i][1];

            boolean aCanSpread = (isInfected[personA] == true) && (leftCount[personA] > 0);
            boolean bCanSpread = (isInfected[personB] == true) && (leftCount[personB] > 0);

            // A가 감염인 경우
            if (isInfected[personA]) {
                // A 감염 횟수가 남음
                if (leftCount[personA] > 0) {
                    leftCount[personA] = leftCount[personA] - 1;
                }
            }

            // B가 감염인 경우
            if (isInfected[personB]) {
                // B 감염 횟수가 남음
                if (leftCount[personB] > 0) {
                    leftCount[personB] = leftCount[personB] - 1;
                }
            }

            // A의 전염으로 인한 B 첫 감염
            if (aCanSpread == true && isInfected[personB] == false) {
                isInfected[personB] = true;
                leftCount[personB] = k;
            }

            // B의 전염으로 인한 A 첫 감염
            if (bCanSpread == true && isInfected[personA] == false) {
                isInfected[personA] = true;
                leftCount[personA] = k;
            }
        }

        for (int i = 0; i < n; ++i) {
            if (isInfected[i] == true) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
    }
}
