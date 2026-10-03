package codeTree.trail2.chapter5.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/intro-the-moment-we-meet/submissions
public class Number1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int aPosition = 0;
        int aTime = 0;
        int bPosition = 0;
        int bTime = 0;
        int matchedTime = -1;

        int[] aTimeLine = new int[1000001];
        int[] bTimeLine = new int[1000001];

        for (int i = 0; i < n; ++i) {
            String direction = sc.next();
            int time = sc.nextInt();

            for (int j = 0; j < time; ++j) {
                if (direction.equals("R")) {
                    aPosition = aPosition + 1;
                } else {
                    aPosition = aPosition - 1;
                }

                aTime = aTime + 1;
                aTimeLine[aTime] = aPosition;
            }
        }

        for (int i = 0; i < m; ++i) {
            String direction = sc.next();
            int time = sc.nextInt();

            for (int j = 0; j < time; ++j) {
                if (direction.equals("R")) {
                    bPosition = bPosition + 1;
                } else {
                    bPosition = bPosition - 1;
                }

                bTime = bTime + 1;
                bTimeLine[bTime] = bPosition;
            }
        }

        for (int i = 1; i <= aTime; ++i) {
            if (aTimeLine[i] == bTimeLine[i]) {
                matchedTime = i;
                break;
            }
        }

        System.out.println(matchedTime);
        sc.close();
    }
}
