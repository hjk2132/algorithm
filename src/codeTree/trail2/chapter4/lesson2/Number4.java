package codeTree.trail2.chapter4.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-decimal-and-binary-number-2/submissions
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();

        int decimal = changeDecimal(binary);
        String answer = changeBinary(decimal * 17);

        System.out.println(answer);
    }

    public static int changeDecimal(String binary) {
        int total = 0;

        for (int i = 0; i < binary.length(); i++) {
            total = total * 2 + (binary.charAt(i) - '0');
        }

        return total;
    }

    public static String changeBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        while(decimal > 0) {
            sb.append(decimal % 2);
            decimal = decimal / 2;
        }

        return sb.reverse().toString();
    }
}
