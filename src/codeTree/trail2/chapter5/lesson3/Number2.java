package codeTree.trail2.chapter5.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-text-based-commands2/submissions
public class Number2 {
    static final int NORTH = 0;
    static final int EAST = 90;
    static final int SOUTH = 180;
    static final int WEST = 270;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] position = new int[3];

        for (int i = 0; i < s.length(); ++i) {
            String instruction = s.substring(i, i+1);
            move(position, instruction);
        }

        System.out.println(position[0] + " " + position[1]);
        sc.close();
    }

    public static void move(int[] position, String instruction) {
        if (instruction.equals("L")) {
            position[2] = position[2] - 90;

            if (position[2] >= 360) {
                position[2] = position[2] % 360;
            }

            if (position[2] == -90) {
                position[2] = 270;
            }
        }

        if (instruction.equals("R")) {
            position[2] = position[2] + 90;

            if (position[2] >= 360) {
                position[2] = position[2] % 360;
            }
        }

        if (instruction.equals("F")) {
            if (position[2] == NORTH) {
                position[1] = position[1] + 1;
            }

            if (position[2] == EAST) {
                position[0] = position[0] + 1;
            }

            if (position[2] == SOUTH) {
                position[1] = position[1] - 1;
            }

            if (position[2] == WEST) {
                position[0] = position[0] - 1;
            }
        }
    }
}
