package codeTree.trail2.chapter4.lesson3;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-painting-white-black/submissions
public class Number5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int position = 0;
        int[] whiteCount = new int[200001];
        int[] blackCount = new int[200001];
        // 0 = None, 1 = White, 2 = Black, 3 = Gray
        int[] color = new int[200001];
        // 0 = White, 1 = Black, 2 = Gray
        int[] answer = new int[3];

        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            String direction = sc.next();

            if (direction.equals("R")) {
                for (int j = 0; j < x; ++j) {
                    if (color[position + 100000] != 3) {
                        blackCount[position + 100000]++;

                        if (whiteCount[position + 100000] >= 2 && blackCount[position + 100000] >= 2) {
                            color[position + 100000] = 3;
                        } else {
                            color[position + 100000] = 2;
                        }
                    }

                    if (j < x - 1) {
                        position = position + 1;
                    }
                }
            }

            if (direction.equals("L")) {
                for (int j = 0; j < x; ++j) {
                    if (color[position + 100000] != 3) {
                        whiteCount[position + 100000]++;

                        if (whiteCount[position + 100000] >= 2 && blackCount[position + 100000] >= 2) {
                            color[position + 100000] = 3;
                        } else {
                            color[position + 100000] = 1;
                        }
                    }

                    if (j < x - 1) {
                        position = position - 1;
                    }
                }
            }
        }

        for (int i = 0; i < 200001; ++i) {
            if (color[i] == 1) {
                answer[0]++;
            } else if (color[i] == 2) {
                answer[1]++;
            } else if (color[i] == 3) {
                answer[2]++;
            }
        }

        System.out.println(answer[0] + " " + answer[1] + " " + answer[2]);
        sc.close();
    }
}
