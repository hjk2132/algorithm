package codeTree.trail2.chapter6.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-awkward-digits-2/submissions
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int max = 0;

        for (int i = 0; i < str.length(); ++i) {
            if (str.substring(i, i+1).equals("0")) {
                String[] arr = str.split("");
                arr[i] = "1";
                String temp = String.join("", arr);
                int value = changeDecimal(temp);

                if (value > max) {
                    max = value;
                }
            } else {
                String[] arr = str.split("");
                arr[i] = "0";
                String temp = String.join("", arr);
                int value = changeDecimal(temp);

                if (value > max) {
                    max = value;
                }
            }
        }

        System.out.println(max);
        sc.close();
    }

    public static int changeDecimal(String input) {
        int length = input.length();
        int sum = 0;

        for (int i = 0; i < length; ++i) {
            String str = input.substring(i, i+1);

            if (str.equals("1")) {
                sum = sum + (int) Math.pow(2, length - i - 1);
            }
        }

        return sum;
    }
}
