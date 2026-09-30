package codeTree.trail2.chapter4.lesson2;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }

        sb.reverse();
        System.out.println(sb);

        sc.close();
    }
}
