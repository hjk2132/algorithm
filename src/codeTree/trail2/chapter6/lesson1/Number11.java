package codeTree.trail2.chapter6.lesson1;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-c-o-w-2/submissions
import java.util.Scanner;

public class Number11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        int[] c = new int[n];
        int[] o = new int[n];
        int[] w = new int[n];

        for (int i = 0; i < n; ++i) {
            String temp = str.substring(i, i+1);

            if (temp.equals("C")) {
                c[i] = 1;
            } else if (temp.equals("O")) {
                o[i] = 1;
            } else if (temp.equals("W")) {
                w[i] = 1;
            } else {
                continue;
            }
        }

        int count = 0;

        for (int i = 0; i < n; ++i) {
            if (c[i] == 1) {
                for (int j = i; j < n; ++j) {
                    if (o[j] == 1) {
                        for (int k = j; k < n; ++k) {
                            if (w[k] == 1) {
                                count = count + 1;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
