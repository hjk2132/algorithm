package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/42748
import java.util.Arrays;

public class Number48 {
    public int[] solution(int[] array, int[][] commands) {
        int[] arr = array;
        int commandSize = commands.length;
        int[] answer = new int[commandSize];

        for (int index = 0; index < commandSize; ++index) {
            int i = commands[index][0];
            int j = commands[index][1];
            int k = commands[index][2];

            answer[index] = getNumber(arr, i, j, k);
        }

        return answer;
    }

    public int getNumber(int[] array, int i, int j, int k) {
        int[] temp = Arrays.copyOfRange(array, i - 1, j);
        Arrays.sort(temp);

        return temp[k-1];
    }
}
