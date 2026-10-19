package codeTree.trail2.chapter8.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-tic-tac-to-as-a-team-2/submissions
public class Number6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] list = new int[3][3];

        for (int i = 0; i < 3; ++i) {
            int input = sc.nextInt();

            for (int j = 0; j < 3; ++j) {
                list[i][2-j] = input % 10;
                input = input / 10;
            }
        }

        int count = 0;
        int[][] teamList = new int[8][2];

        // row
        for (int i = 0; i < 3; ++i) {
            boolean isClear = true;
            int[] temp = new int[2];

            for (int j = 0; j < 3; ++j) {
                int player = list[i][j];

                if (temp[0] == 0) { temp[0] = player; }
                else if (player != temp[0] && temp[1] == 0) { temp[1] = player; }
                else if (player != temp[0] && player != temp[1]) { isClear = false; }
            }

            if (temp[1] == 0) { isClear = false; }

            if (isClear) {
                for (int j = 0; j < 8; ++j) {
                    if (teamList[j][0] == temp[0] && teamList[j][1] == temp[1] ||
                            teamList[j][0] == temp[1] && teamList[j][1] == temp[0])
                    {
                        break;
                    } else if (teamList[j][0] == 0) {
                        teamList[j][0] = temp[0];
                        teamList[j][1] = temp[1];
                        break;
                    } else {
                        continue;
                    }
                }
            }
        }

        // column
        for (int i = 0; i < 3; ++i) {
            boolean isClear = true;
            int[] temp = new int[2];

            for (int j = 0; j < 3; ++j) {
                int player = list[j][i];

                if (temp[0] == 0) { temp[0] = player; }
                else if (player != temp[0] && temp[1] == 0) { temp[1] = player; }
                else if (player != temp[0] && player != temp[1]) { isClear = false; }
            }

            if (temp[1] == 0) { isClear = false; }

            if (isClear) {
                for (int j = 0; j < 8; ++j) {
                    if (teamList[j][0] == temp[0] && teamList[j][1] == temp[1] ||
                            teamList[j][0] == temp[1] && teamList[j][1] == temp[0])
                    {
                        break;
                    } else if (teamList[j][0] == 0) {
                        teamList[j][0] = temp[0];
                        teamList[j][1] = temp[1];
                        break;
                    } else {
                        continue;
                    }
                }
            }
        }

        // ld
        boolean ldClear = true;
        int[] ldTemp = new int[2];

        for (int i = 0; i < 3; ++i) {
            int player = list[i][i];

            if (ldTemp[0] == 0) { ldTemp[0] = player; }
            else if (player != ldTemp[0] && ldTemp[1] == 0) { ldTemp[1] = player; }
            else if (player != ldTemp[0] && player != ldTemp[1]) { ldClear = false; }
        }

        if (ldTemp[1] == 0) { ldClear = false; }

        if (ldClear) {
            for (int j = 0; j < 8; ++j) {
                if (teamList[j][0] == ldTemp[0] && teamList[j][1] == ldTemp[1] ||
                        teamList[j][0] == ldTemp[1] && teamList[j][1] == ldTemp[0])
                {
                    break;
                } else if (teamList[j][0] == 0) {
                    teamList[j][0] = ldTemp[0];
                    teamList[j][1] = ldTemp[1];
                    break;
                } else {
                    continue;
                }
            }
        }

        // rd
        boolean rdClear = true;
        int[] rdTemp = new int[2];

        for (int i = 0; i < 3; ++i) {
            int player = list[i][2-i];

            if (rdTemp[0] == 0) { rdTemp[0] = player; }
            else if (player != rdTemp[0] && rdTemp[1] == 0) { rdTemp[1] = player; }
            else if (player != rdTemp[0] && player != rdTemp[1]) { rdClear = false; }
        }

        if (rdTemp[1] == 0) { rdClear = false; }

        if (rdClear) {
            for (int j = 0; j < 8; ++j) {
                if (teamList[j][0] == rdTemp[0] && teamList[j][1] == rdTemp[1] ||
                        teamList[j][0] == rdTemp[1] && teamList[j][1] == rdTemp[0])
                {
                    break;
                } else if (teamList[j][0] == 0) {
                    teamList[j][0] = rdTemp[0];
                    teamList[j][1] = rdTemp[1];
                    break;
                } else {
                    continue;
                }
            }
        }

        // counting
        for (int i = 0; i < 8; ++i) {
            if (teamList[i][0] != 0) {
                count = count + 1;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
