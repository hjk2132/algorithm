package codeTree.trail2.chapter4.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-various-numeral-system-transformations/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int modulo = n % b;
            sb.append(modulo);
            n = n / b;
        }

        System.out.println(sb.reverse());
        sc.close();
    }
}
