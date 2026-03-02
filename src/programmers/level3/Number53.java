package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/138477
public class Number53 {
    public int[] solution(int k, int[] score) {
        int[] board = new int[k];
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; ++i) {
            int inputScore = score[i];

            if (inputScore > board[board.length - 1]) {
                board[board.length - 1] = inputScore;
            }
            sort(board);

            if (i < k - 1) {
                answer[i] = board[i];
            } else {
                answer[i] = board[board.length - 1];
            }
        }

        return answer;
    }

    public int[] sort (int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < length - 1; ++j) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
