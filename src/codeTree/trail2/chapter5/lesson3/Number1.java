package codeTree.trail2.chapter5.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-move-in-direction/submissions
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] position = new int[2];

        for (int i = 0; i < n; ++i) {
            String direction = sc.next();
            int distance = sc.nextInt();

            move(position, direction, distance);
        }

        System.out.println (position[0] + " " + position[1]);
        sc.close();
    }

    public static void move(int[] position, String direction, int distance) {
        if (direction.equals("N")) {
            position[1] = position[1] + distance;
        }
        if (direction.equals("S")) {
            position[1] = position[1] - distance;
        }
        if (direction.equals("E")) {
            position[0] = position[0] + distance;
        }
        if (direction.equals("W")) {
            position[0] = position[0] - distance;
        }
    }
}
