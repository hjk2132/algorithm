package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12910
public class Number25 {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
        }

        Collections.sort(answer);

        if(answer.isEmpty()) {
            answer.add(-1);
        }

        return answer;
    }
}
