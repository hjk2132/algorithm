package codeTree.trail2.chapter6.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-beautiful-sequence-2/submissions
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] aArr = new int[n];
        int[] bArr = new int[m];
        int[] checkList = new int[m];

        for (int i = 0; i < n; ++i) {
            aArr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; ++i) {
            bArr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n - m + 1; ++i) {
            // checkList 초기화
            for (int j = 0; j < m; ++j) {
                checkList[j] = 0;
            }

            // bArr에 해당되는지 checkList에 표기
            for (int j = i; j < i + m; ++j) {
                int temp = aArr[j];

                for (int k = 0; k < bArr.length; ++k) {
                    if (bArr[k] == temp && checkList[k] == 0) {
                        checkList[k] = 1;
                        break;
                    }
                }
            }

            boolean isTrue = true;

            for (int j = 0; j < bArr.length; ++j) {
                if (checkList[j] == 0) {
                    isTrue = false;
                }
            }

            if (isTrue) {
                count = count + 1;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
