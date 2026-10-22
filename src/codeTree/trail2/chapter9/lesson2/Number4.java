package codeTree.trail2.chapter9.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-x-run/submissions
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int left = target;

        int time = 0;
        int speed = 0;

        while(left > 0) {
            if (left >= (speed + 1) * (speed + 2) / 2) {
                speed = speed + 1;
            } else if (left >= speed * (speed + 1) / 2) {
                speed = speed;
            } else {
                speed = speed - 1;
            }

            left = left - speed;
            time = time + 1;
        }

        System.out.print(time);
        sc.close();
    }
}
