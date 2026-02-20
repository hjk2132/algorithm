package programmers.level2;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12950
public class Number37 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rowSize = arr1.length;
        int colSize = arr1[0].length;
        int[][] newArr = new int[rowSize][colSize];

        for(int i = 0; i < rowSize; ++i) {
            for (int j = 0; j < colSize; ++j) {
                newArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return newArr;
    }
}
