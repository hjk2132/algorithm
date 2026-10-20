package codeTree.trail2.chapter8.lesson2;

import java.util.Arrays;
import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-find-a-b-c-d-2/submissions
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[15];
        int[] answer = new int[4];
        boolean findAnswer = false;

        for (int i = 0; i < 15; ++i) {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < 15; ++i) {
            for (int j = i + 1; j < 15; ++j) {
                for (int k = j + 1; k < 15; ++k) {
                    for (int l = k + 1; l < 15; ++l) {
                        int a = list[i];
                        int b = list[j];
                        int c = list[k];
                        int d = list[l];

                        boolean isPass = true;

                        if (!isPassed(list, a+b)) { isPass = false; }
                        if (!isPassed(list, a+c)) { isPass = false; }
                        if (!isPassed(list, a+d)) { isPass = false; }
                        if (!isPassed(list, b+c)) { isPass = false; }
                        if (!isPassed(list, b+d)) { isPass = false; }
                        if (!isPassed(list, c+d)) { isPass = false; }
                        if (!isPassed(list, a+b+c)) { isPass = false; }
                        if (!isPassed(list, a+b+d)) { isPass = false; }
                        if (!isPassed(list, b+c+d)) { isPass = false; }
                        if (!isPassed(list, a+b+c+d)) { isPass = false; }

                        if (isPass) {
                            answer[0] = list[i];
                            answer[1] = list[j];
                            answer[2] = list[k];
                            answer[3] = list[l];

                            findAnswer = true;
                            break;
                        }
                    }

                    if (findAnswer) { break; }
                }

                if (findAnswer) { break; }
            }

            if (findAnswer) { break; }
        }

        Arrays.sort(answer);

        for (int i = 0; i < 4; ++i) {
            System.out.print(answer[i] + " ");
        }

        sc.close();
    }

    public static boolean isPassed(int[] list, int input) {
        boolean isPassed = false;

        for (int i = 0; i < 15; ++i) {
            if (list[i] == input) {
                isPassed = true;
                return isPassed;
            }
        }

        return isPassed;
    }
}
