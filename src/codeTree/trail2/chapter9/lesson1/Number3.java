package codeTree.trail2.chapter9.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-district-cleaning/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[105];
        int[] input = new int[4];
        int count = 0;

        for (int i = 0; i < 4; ++i) {
            input[i] = sc.nextInt();
        }

        for (int i = input[0]; i < input[1]; ++i) {
            list[i] = 1;
        }

        for (int i = input[2]; i < input[3]; ++i) {
            list[i] = 1;
        }

        for (int i = 0; i < 105; ++i) {
            if (list[i] == 1) { count = count + 1; }
        }

        System.out.println(count);
        sc.close();
    }
}
