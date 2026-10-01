package codeTree.trail2.chapter4.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-area-been-to-and-from2/description
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int position = 0;
        int count = 0;
        int[] array = new int[2000];

        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            String direction = sc.next();

            if (direction.equals("R")) {
                for (int j = 0; j < x; ++j) {
                    array[position+1000] = array[position+1000] + 1;
                    position = position + 1;
                }
            }

            if (direction.equals("L")) {
                for (int j = 0; j < x; ++j) {
                    position = position - 1;
                    array[position+1000] = array[position+1000] + 1;
                }
            }
        }

        for (int i = 0; i < 2000; ++i) {
            if (array[i] > 1) {
                count = count + 1;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
