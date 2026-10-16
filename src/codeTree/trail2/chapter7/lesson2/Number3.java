package codeTree.trail2.chapter7.lesson2;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-interesting-numbers-2/submissions
public class Number3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int answer = 0;

        for (int i = x; i <= y; ++i) {
            int thisNum = i;

            int beforeFirst = -1;
            int beforeSecond = -1;
            int firstCount = 0;
            int secondCount = 0;
            boolean goNext = true;

            while (goNext && thisNum > 0) {
                int checkNum = thisNum % 10;

                if (beforeFirst == -1) {
                    beforeFirst = checkNum;
                    firstCount = firstCount + 1;
                    thisNum = thisNum / 10;
                } else if (checkNum == beforeFirst) {
                    firstCount = firstCount + 1;
                    thisNum = thisNum / 10;
                } else if (beforeSecond == -1) {
                    beforeSecond = checkNum;
                    secondCount = secondCount + 1;
                    thisNum = thisNum / 10;
                } else {
                    if (checkNum == beforeSecond) {
                        secondCount = secondCount + 1;
                        thisNum = thisNum / 10;
                    } else {
                        goNext = false;
                    }
                }

                if (firstCount == 1 || secondCount == 1 || secondCount == 0) {
                    continue;
                } else {
                    goNext = false;
                }
            }

            if (goNext && (firstCount == 1 || secondCount == 1)) {
                answer = answer + 1;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
