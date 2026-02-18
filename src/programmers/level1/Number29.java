package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12935
public class Number29 {
    public int[] solution(int[] arr) {
        int min = arr[0];
        int[] newArr = new int [arr.length - 1];
        int index = 0;

        if (arr.length == 1) {
            return new int[] { -1 };
        } else {
            for (int i = 0; i < arr.length; ++i) {
                if (arr[i] < min) { min = arr[i]; }
            }

            for (int i = 0; i < arr.length; ++i) {
                if (arr[i] != min) {
                    newArr[index] = arr[i];
                    index++;
                }
            }

            return newArr;
        }
    }
}