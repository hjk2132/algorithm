package codeTree.trail2.chapter6.lesson1;

import java.util.Scanner;

// url : https://www.codetree.ai/ko/trails/complete/curated-cards/challenge-find-hidden-words-2/submissions
public class Number14 {
    public static final String STR = "LEE";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] arr = new String[n][m];

        for (int i = 0; i < n; ++i) {
            String input = sc.next();

            for (int j = 0; j < m; ++j) {
                arr[i][j] = input.substring(j, j+1);
            }
        }

        int count = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                // System.out.println("==== i, j : " + i + " " + j + " ====");
                count = count + goRight(arr, i, j);
                count = count + goLeft(arr, i, j);
                count = count + goUp(arr, i, j);
                count = count + goDown(arr, i, j);

                count = count + goRightUp(arr, i, j);
                count = count + goRightDown(arr, i, j);
                count = count + goLeftUp(arr, i, j);
                count = count + goLeftDown(arr, i, j);
            }
        }

        System.out.println(count);
        sc.close();
    }
    public static int goRight(String[][] arr, int i, int j) {
        for (int k = 0; k < 3; ++k) {
            // 경계 벗어남
            if (j+k >= arr[0].length) {
                return 0;
            }
            // 글자 틀림
            if (!arr[i][j+k].equals(STR.substring(k, k+1))) {
                return 0;
            }
        }
        // System.out.println("goRight = 1");
        return 1;
    }
    public static int goLeft(String[][] arr, int i, int j) {
        for (int k = 0; k < 3; ++k) {
            // 경계 벗어남
            if (j-k < 0) {
                return 0;
            }
            // 글자 틀림
            if (!arr[i][j-k].equals(STR.substring(k, k+1))) {
                return 0;
            }
        }
        // System.out.println("goLeft = 1");
        return 1;
    }
    public static int goUp(String[][] arr, int i, int j) {
        for (int k = 0; k < 3; ++k) {
            // 경계 벗어남
            if (i-k < 0) {
                return 0;
            }
            // 글자 틀림
            if (!arr[i-k][j].equals(STR.substring(k, k+1))) {
                return 0;
            }
        }
        // System.out.println("goUp = 1");
        return 1;
    }
    public static int goDown(String[][] arr, int i, int j) {
        for (int k = 0; k < 3; ++k) {
            // 경계 벗어남
            if (i+k >= arr.length) {
                return 0;
            }
            // 글자 틀림
            if (!arr[i+k][j].equals(STR.substring(k, k+1))) {
                return 0;
            }
        }
        // System.out.println("goDown = 1");
        return 1;
    }
    public static int goRightUp(String[][] arr, int i, int j) {
        for (int k = 0; k < 3; ++k) {
            // 경계 벗어남
            if (i-k < 0) {
                return 0;
            }
            if (j+k >= arr[0].length) {
                return 0;
            }
            // 글자 틀림
            if (!arr[i-k][j+k].equals(STR.substring(k, k+1))) {
                return 0;
            }
        }
        // System.out.println("goRightUp = 1");
        return 1;
    }
    public static int goRightDown(String[][] arr, int i, int j) {
        for (int k = 0; k < 3; ++k) {
            // 경계 벗어남
            if (i+k >= arr.length) {
                return 0;
            }
            if (j+k >= arr[0].length) {
                return 0;
            }
            // 글자 틀림
            if (!arr[i+k][j+k].equals(STR.substring(k, k+1))) {
                return 0;
            }
        }
        // System.out.println("goRightDown = 1");
        return 1;
    }
    public static int goLeftUp(String[][] arr, int i, int j) {
        for (int k = 0; k < 3; ++k) {
            // 경계 벗어남
            if (i-k < 0) {
                return 0;
            }
            if (j-k < 0) {
                return 0;
            }
            // 글자 틀림
            if (!arr[i-k][j-k].equals(STR.substring(k, k+1))) {
                return 0;
            }
        }
        // System.out.println("goLeftUp = 1");
        return 1;
    }
    public static int goLeftDown(String[][] arr, int i, int j) {
        for (int k = 0; k < 3; ++k) {
            // 경계 벗어남
            if (i+k >= arr.length) {
                return 0;
            }
            if (j-k < 0) {
                return 0;
            }
            // 글자 틀림
            if (!arr[i+k][j-k].equals(STR.substring(k, k+1))) {
                return 0;
            }
        }
        // System.out.println("goLeftDown = 1");
        return 1;
    }
}
