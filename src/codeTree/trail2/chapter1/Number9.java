package codeTree.trail2.chapter1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-find-the-least-common-multiple/description
public class Number9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int small = 0;
        int large = 0;

        if (n > m) {
            large = n;
            small = m;
        } else {
            large = m;
            small = n;
        }

        int lcd = 1;

        for (int i = 1; i <= small; ++i) {
            if (n % i == 0 && m % i == 0 && i > lcd) {
                lcd = i;
            }
        }

        System.out.println(n * m / lcd);

    }
}
