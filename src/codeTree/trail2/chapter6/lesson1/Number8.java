package codeTree.trail2.chapter6.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-a-room-in-a-circle/submissions
public class Number8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalPeople = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
            totalPeople = totalPeople + arr[i];
            // System.out.println("arr[i] = " + arr[i]);
            // System.out.println("totalPeople = " + totalPeople);
        }

        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < n; ++i) {
            // System.out.println("===== room num : " + i + " ======");
            int distance = getDistance(arr, totalPeople, i, n);
            // System.out.println(" i, distance = " + i + " " + distance);

            if (distance < minDistance) {
                minDistance = distance;
            }
        }

        System.out.println(minDistance);
        sc.close();
    }

    public static int getDistance(int[] arr, int totalPeople, int i, int n) {
        int distance = 0;
        int left = totalPeople;
        int index = i;

        while(index != (i + n - 1) % n) {
            left = left - arr[index];
            distance = distance + left;
            index = (index + 1) % n;

            // System.out.println("index = " + index + "/ left = " + left + " / distance = " + distance);
        }

        return distance;
    }
}
