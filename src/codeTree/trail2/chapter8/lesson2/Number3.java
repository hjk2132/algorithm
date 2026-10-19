package codeTree.trail2.chapter8.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-the-most-frequent-pair/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] list =  new int[m][2];
        int[] count = new int[m];

        for (int i = 0; i < m; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = 0; j < m; ++j) {
                if (list[j][0] == a && list[j][1] == b ||
                        list[j][0] == b && list[j][1] == a)
                {
                    count[j] = count [j] + 1;
                    break;
                }
            }

            list[i][0] = a;
            list[i][1] = b;
        }

        int answer = 0;

        for (int i = 0; i < m; ++i) {
            answer = Math.max(answer, count[i] + 1);
        }

        System.out.println(answer);
        sc.close();
    }
}
