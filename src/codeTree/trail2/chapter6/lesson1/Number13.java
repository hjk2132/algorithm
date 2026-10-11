package codeTree.trail2.chapter6.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-O-mok/submissions
public class Number13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        int player = 0;
        boolean isWinner = false;
        int y = 0;
        int x = 0;

        for (int i = 0; i < 19; ++i) {
            for (int j = 0; j < 19; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 19; ++i) {
            for (int j = 0; j < 19; ++j) {
                player = arr[i][j];

                if (player != 0) {
                    isWinner = isWin(arr, i, j);
                }

                if (isWinner) {
                    y = i + 1;
                    x = j + 1;
                    break;
                }
            }

            if (isWinner) {
                break;
            }
        }

        System.out.println(player);
        if (isWinner == true) {
            System.out.println(y + " " + x);
        }
        sc.close();
    }

    public static boolean isWin(int[][] arr, int i, int j) {

        int value = arr[i][j];
        int[] verticle = new int[5];
        int[] horizon = new int[5];
        int[] lDiagonal = new int[5];
        int[] rDiagonal = new int[5];

        boolean isVerticle = true;
        boolean isHorizon = true;
        boolean isLdiagonal = true;
        boolean isRdiagonal = true;

        // horizon check
        if (i == 0 || i == 1 || i == 17 || i == 18) {
            for (int k = 0; k < 5; ++k) {
                if (j > 1 && j < 17) {
                    horizon[k] = arr[i][j-2+k];
                }
            }

            for (int k = 0; k < 5; ++k) {
                if (horizon[k] != value) {
                    return false;
                }
            }

            return isHorizon;
        } else if (j == 0 || j == 1 || j == 17 || j == 18) {
            // verticle check
            for (int k = 0; k < 5; ++k) {
                if (i > 1 && i < 17) {
                    verticle[k] = arr[i-2+k][j];
                }
            }

            for (int k = 0; k < 5; ++k) {
                if (verticle[k] != value) {
                    return false;
                }
            }

            return isVerticle;
        } else {
            for (int k = 0; k < 5; ++k) {
                verticle[k] = arr[i-2+k][j];
                horizon[k] = arr[i][j-2+k];
                lDiagonal[k] = arr[i-2+k][j-2+k];
                rDiagonal[k] = arr[i+2-k][j-2+k];
            }

            for (int k = 0; k < 5; ++k) {
                if (verticle[k] != value) { isVerticle = false; }
                if (horizon[k] != value) { isHorizon = false; }
                if (lDiagonal[k] != value) { isLdiagonal = false; }
                if (rDiagonal[k] != value) { isRdiagonal = false; }
            }

            if (isVerticle || isHorizon || isLdiagonal || isRdiagonal ) {
                return true;
            } else {
                return false;
            }
        }
    }
}
