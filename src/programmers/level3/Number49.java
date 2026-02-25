package programmers.level3;

import java.util.ArrayList;
import java.util.Collections;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/68644
public class Number49 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < numbers.length; ++i) {
            for (int j = i + 1; j < numbers.length; ++j) {
                int sum = numbers[i] + numbers[j];

                if (!answerList.contains(sum)) {
                    answerList.add(sum);
                }
            }
        }

        Collections.sort(answerList);

        int[] answerArr = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); ++i) {
            answerArr[i] = answerList.get(i);
        }

        return answerArr;
    }
}
