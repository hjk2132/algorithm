package codeTree.trail2.chapter1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-create-a-rectangle-using-a-function/introduction
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print("1");
            }
            System.out.println();
        }

        sc.close();
    }
}
