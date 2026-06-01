package codeTree.trail2.chapter1;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int count = 1;

        for (int i = 0; i < input; ++i) {
            for (int j = 0; j < input; ++j) {
                System.out.print(count + " ");
                count = count + 1;

                if (count >= 10) {
                    count = 1;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
