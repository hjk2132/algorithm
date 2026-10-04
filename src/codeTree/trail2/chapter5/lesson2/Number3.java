package codeTree.trail2.chapter5.lesson2;

import java.util.Scanner;

public class Number3 {
    static final int MAX_TIME = 1000000;

    // 선두 상태를 나타내는 상수
    static final int NONE = 0;
    static final int AFORWARD = 1;
    static final int BFORWARD = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] aTimeLine = new int[MAX_TIME + 1];
        int[] bTimeLine = new int[MAX_TIME + 1];

        // A의 이동 내역 기록
        int timeA = 1;
        for (int i = 0; i < n; ++i) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 0; j < t; ++j) {
                aTimeLine[timeA] = aTimeLine[timeA - 1] + v;
                timeA = timeA + 1;
            }
        }

        // B의 이동 내역 기록
        int timeB = 1;
        for (int i = 0; i < m; ++i) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 0; j < t; ++j) {
                bTimeLine[timeB] = bTimeLine[timeB - 1] + v;
                timeB = timeB + 1;
            }
        }

        int totalTime = timeA - 1; // A와 B의 총 이동 시간이 동일함
        int forwardState = NONE;
        int changeCount = 0;

        // 매 초마다 선두 비교
        for (int t = 1; t <= totalTime; ++t) {
            if (aTimeLine[t] > bTimeLine[t]) {
                // B였는데 A로 역전된 경우
                if (forwardState == BFORWARD) {
                    changeCount = changeCount + 1;
                }
                forwardState = AFORWARD;
            } else if (bTimeLine[t] > aTimeLine[t]) {
                // A였는데 B로 역전된 경우에만 카운트 증가
                if (forwardState == AFORWARD) {
                    changeCount = changeCount + 1;
                }
                forwardState = BFORWARD;
            }
        }

        System.out.println(changeCount);
        sc.close();
    }
}
