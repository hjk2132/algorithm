package codeTree.trail2.chapter5.lesson2;

import java.util.Scanner;

// url :
public class Number4 {
    static final int MAX_TIME = 2000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] aTimeLine = new int[MAX_TIME + 1];
        int[] bTimeLine = new int[MAX_TIME + 1];

        int aTotalTime = 1;
        int bTotalTime = 1;

        int aPosition = 0;
        int bPosition = 0;

        // A의 행적 기록
        for (int i = 1; i <= n; ++i) {
            int t = sc.nextInt();
            String direction = sc.next();

            for (int j = 0; j < t; ++j) {
                if (direction.equals("L")) {
                    aPosition = aPosition - 1;
                } else if (direction.equals("R")) {
                    aPosition = aPosition + 1;
                }
                aTimeLine[aTotalTime] = aPosition;
                aTotalTime = aTotalTime + 1;
            }
        }

        // B의 행적 기록
        for (int i = 1; i <= m; ++i) {
            int t = sc.nextInt();
            String direction = sc.next();

            for (int j = 0; j < t; ++j) {
                if (direction.equals("L")) {
                    bPosition = bPosition - 1;
                } else if (direction.equals("R")) {
                    bPosition = bPosition + 1;
                }
                bTimeLine[bTotalTime] = bPosition;
                bTotalTime = bTotalTime + 1;
            }
        }

        // 움직인 전체 시간 계산
        int maxTime = 0;
        if (aTotalTime > bTotalTime) {
            maxTime = aTotalTime - 1;
        } else {
            maxTime = bTotalTime - 1;
        }

        // 최종 위치에 머물러 있도록 나머지 채움
        for (int i = aTotalTime; i <= maxTime; ++i) {
            aTimeLine[i] = aTimeLine[i - 1];
        }
        for (int i = bTotalTime; i <= maxTime; ++i) {
            bTimeLine[i] = bTimeLine[i - 1];
        }

        boolean sameBefore = true;
        int totalCount = 0;

        // A와 B의 위치를 매 초마다 비교
        for (int i = 1; i <= maxTime; ++i) {
            if (aTimeLine[i] == bTimeLine[i]) {
                if (sameBefore == false) {
                    totalCount = totalCount + 1;
                }
                sameBefore = true;
            } else {
                sameBefore = false;
            }
        }

        System.out.println(totalCount);
        sc.close();
    }
}
