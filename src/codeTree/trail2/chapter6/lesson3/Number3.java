package codeTree.trail2.chapter6.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-a-two-way-lock/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        // 기준 조합 입력
        for (int i = 0; i < 3; ++i) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; ++i) {
            arr2[i] = sc.nextInt();
        }

        int count = 0;

        // 조합 통과 여부 파악
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                for (int k = 1; k <= n; ++k) {
                    // 조합 1이나 조합2가 통과하는지 확인
                    if (isPass(arr1, i, j, k, n) || isPass(arr2, i, j, k, n)) {
                        count = count + 1;
                    }
                }
            }
        }

        System.out.println(count);
        sc.close();
    }

    public static boolean isPass(int[] arr, int a, int b, int c, int n) {
        // 조합 a, b, c의 단순 거리차를 계산
        int diffA = Math.abs(arr[0] - a);
        int diffB = Math.abs(arr[1] - b);
        int diffC = Math.abs(arr[2] - c);

        // 원형으로 돌아가는 경우를 고려
        diffA = Math.min(diffA, n - diffA);
        diffB = Math.min(diffB, n - diffB);
        diffC = Math.min(diffC, n - diffC);

        // 세 자리 모두 차이가 2 이내에 해당하는 경우만 true
        if (diffA <= 2 && diffB <= 2 && diffC <= 2) {
            return true;
        } else {
            return false;
        }
    }
}
