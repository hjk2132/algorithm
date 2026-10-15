package codeTree.trail2.chapter7.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-rotten-cheese/submissions
public class Number7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int s = sc.nextInt();

        // p (people) - m (cheese) - t (time)
        int[][] days = new int[d][3];
        // p (people) - t (time)
        int[][] sick = new int[s][2];

        for (int i = 0; i < d; ++i) {
            // people
            days[i][0] = sc.nextInt();
            // cheese
            days[i][1] = sc.nextInt();
            // time
            days[i][2] = sc.nextInt();
        }

        for (int i = 0; i < s; ++i) {
            // people
            sick[i][0] = sc.nextInt();
            // time
            sick[i][1] = sc.nextInt();
        }

        int maxNeedCount = 0;

        // find bad cheese
        for (int i = 1; i <= m; ++i) {
            int cheeseNum = i;

            boolean[] checkList = new boolean[s];
            boolean isAllPassed = true;

            // check all sick people who eat bad cheese before
            for (int j = 0; j < s; ++j) {
                int sickPeople = sick[j][0];
                int sickTime = sick[j][1];

                // check he really eat bad cheese
                for (int k = 0; k < d; ++k) {
                    if (days[k][0] == sickPeople) {
                        if (days[k][1] == cheeseNum && days[k][2] < sickTime) {
                            checkList[j] = true;
                            break;
                        }
                    }
                }
            }

            for (int j = 0; j < s; ++j) {
                if (!checkList[j]) {
                    isAllPassed = false;
                    break;
                }
            }

            if (isAllPassed) {
                // find how many pills need
                int[] isNeed = new int[n];
                int needCount = 0;

                for (int j = 0; j < d; ++j) {
                    if (days[j][1] == cheeseNum) {
                        int illPeople = days[j][0] - 1;
                        isNeed[illPeople] = 1;
                    }
                }

                for (int j = 0; j < n; ++j) {
                    if (isNeed[j] == 1) {
                        needCount = needCount + 1;
                    }
                }

                if (needCount > maxNeedCount) {
                    maxNeedCount = needCount;
                }
            }
        }

        System.out.println(maxNeedCount);
        sc.close();
    }
}
