package codeTree.trail2.chapter4.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-transformation-of-number-system/description
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();

        int decimal = changeDecimal(A, N);
        String answer = changeBaseN(B, decimal);

        System.out.println(answer);
        sc.close();
    }

    public static int changeDecimal(int a, String n) {
        int total = 0;

        for (int i = 0; i < n.length(); ++i) {
            int temp = n.charAt(i) - '0';
            total = total * a + temp;
        }

        return total;
    }

    public static String changeBaseN(int b, int decimal) {
        StringBuilder sb = new StringBuilder();

        if(decimal == 0) {
            return "0";
        }

        while (decimal > 0) {
            int modulo = decimal % b;
            sb.append(modulo);
            decimal = decimal / b;
        }

        return sb.reverse().toString();
    }
}
