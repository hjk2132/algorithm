package codeTree.trail2.chapter3.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-kth-number/description
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        for (int i = 0; i < size; ++i) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < size; ++i) {
            arr2[i] = sc.nextInt();
        }

        boolean isSame = false;

        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                if (arr1[i] == arr2[j]) {
                    isSame = true;
                    break;
                } else {
                    isSame = false;
                }
            }

            if (isSame == false) {
                break;
            }
        }

        if(isSame) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
