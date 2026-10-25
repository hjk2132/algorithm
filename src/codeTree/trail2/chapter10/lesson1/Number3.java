package codeTree.trail2.chapter10.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-odd-even-bundle/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0;
        int even = 0;
        int[] list = new int[n];

        for (int i = 0; i < n; ++i) {
            list[i] = sc.nextInt();
            if (list[i] % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }

        while(odd > even) {
            odd = odd - 2;
            even = even + 1;
        }

        if (even > odd + 1) {
            even = odd + 1;
        }

        System.out.println(odd + even);
        sc.close();
    }
}
