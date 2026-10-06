package codeTree.trail2.chapter5.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/test-keep-the-lead-3/submissions
public class Number6 {
    static final int MAXTIME = 1000 * 1000;
    static final int BOTHFORWARD = 0;
    static final int AFORWARD = 1;
    static final int BFORWARD = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // A, B의 행적 및 시간 당 명예의 전당 상황
        int[] aTimeLine = new int[MAXTIME + 1];
        int[] bTimeLine = new int[MAXTIME + 1];

        // A, B의 전체 이동 시간
        int aTime = 1;
        int bTime = 1;

        // A, B의 현재 위치
        int aPosition = 0;
        int bPosition = 0;

        // A 행적 기록
        for (int i = 0; i < n; ++i) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 1; j <= t; ++j) {
                aPosition = aPosition + v;
                aTimeLine[aTime] = aPosition;
                aTime = aTime + 1;
            }
        }

        // B 행적 기록
        for (int i = 0; i < m; ++i) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 1; j <= t; ++j) {
                bPosition = bPosition + v;
                bTimeLine[bTime] = bPosition;
                bTime = bTime + 1;
            }
        }

        // A, B중 긴 시간을 전체 이동 시각으로 판단
        int totalTime = (aTime > bTime) ? aTime : bTime;

        // 전체 이동 시각 이후 A의 위치 고정
        for (int i = aTime; i < MAXTIME + 1; ++i) {
            aTimeLine[i] = aTimeLine[aTime];
        }

        // 전체 이동 시각 이후 B의 위치 고정
        for (int i = bTime; i < MAXTIME + 1; ++i) {
            bTimeLine[i] = bTimeLine[bTime];
        }

        // 명예의 전당 변경 횟수
        int totalCount = 0;

        // 시간 당 명예의 전당
        int beforeHall = BOTHFORWARD;
        for (int i = 1; i <= totalTime - 1; ++i) {
            int thisHall = -1;

            if (aTimeLine[i] > bTimeLine[i]) {
                thisHall = AFORWARD;
            } else if (aTimeLine[i] < bTimeLine[i]) {
                thisHall = BFORWARD;
            } else {
                thisHall = BOTHFORWARD;
            }

            if (beforeHall != thisHall) {
                totalCount = totalCount + 1;
                beforeHall = thisHall;
            }
        }
        System.out.println(totalCount);
        sc.close();
    }
}
