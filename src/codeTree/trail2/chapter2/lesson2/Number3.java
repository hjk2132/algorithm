package codeTree.trail2.chapter2.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-until-the-moment-I-reach-one/description
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        printCount(input, 0);
    }

    public static void printCount(int input, int count) {
        if (input == 1) {
            System.out.println(count);
        } else {
            if (input % 2 == 0) {
                input = input / 2;
                count = count + 1;
            } else {
                input = input / 3;
                count = count + 1;
            }

            printCount(input, count);
        }
    }
}
