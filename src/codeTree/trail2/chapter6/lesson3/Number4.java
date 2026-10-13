package codeTree.trail2.chapter6.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-numeric-count/description
public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];
        int[] bArr = new int[n];
        int[] cArr = new int[n];

        int[] strike = new int[n];
        int[] ball = new int[n];

        // 정보 입력받기
        for (int i = 0; i < n; ++i) {
            int input = sc.nextInt();
            aArr[i] = input / 100;
            bArr[i] = (input % 100) / 10;
            cArr[i] = (input % 10);

            strike[i] = sc.nextInt();
            ball[i] = sc.nextInt();
        }

        int count = 0;

        // 모든 답변 조건을 통과하는지 검사
        for (int i = 111; i <= 999; ++i) {
            int a = i / 100;
            int b = (i % 100) / 10;
            int c = (i % 10);

            // 0이 포함되거나 서로 같은 숫자가 있는 경우는 검사 대상에서 제외
            if (a == 0 || b == 0 || c == 0) continue;
            if (a == b || b == c || a == c) continue;

            int[] tInput = new int[] { a, b, c };

            if (isPass(tInput, aArr, bArr, cArr, strike, ball)) {
                count = count + 1;
            }
        }

        System.out.println(count);
        sc.close();
    }

    public static boolean isPass(int[] input,
                                 int[] aArr, int[] bArr, int[] cArr,
                                 int[] strike, int[] ball)
    {
        // 모든 질문에 대한 검사 시작
        for (int i = 0; i < aArr.length; ++i) {
            int tStrike = 0;
            int tBall = 0;

            // 질문으로 주어졌던 세 자리 숫자 배열
            int[] target = { aArr[i], bArr[i], cArr[i] };

            // 각 자리가 strike인지 (ball 검사 넘기기용)
            boolean[] isStrike = new boolean[3];

            // strike 검사
            if (input[0] == target[0]) { isStrike[0] = true; tStrike = tStrike + 1; }
            if (input[1] == target[1]) { isStrike[1] = true; tStrike = tStrike + 1; }
            if (input[2] == target[2]) { isStrike[2] = true; tStrike = tStrike + 1; }

            // strike가 아닌 경우만 추가로 ball 검사
            for (int j = 0; j < 3; ++j) {
                // 후보 숫자(input)의 j번째 자리가 strike가 아닌 경우
                if (!isStrike[j]) {
                    // 질문 숫자(target)의 k번째 자리와 비교
                    for (int k = 0; k < 3; ++k) {
                        // 자리는 달라야 하고, target[k] 역시 strike가 아니어야 함
                        if (k != j && !isStrike[k]) {
                            // ball에 해당하면 카운트 증가
                            if (input[j] == target[k]) {
                                tBall = tBall + 1;
                            }
                        }
                    }
                }
            }

            // Strike와 Ball 개수가 일치하는지 검사
            if (strike[i] != tStrike || ball[i] != tBall) {
                return false;
            }
        }

        return true;
    }
}
