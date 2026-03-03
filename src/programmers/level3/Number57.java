package programmers.level3;

import java.util.ArrayList;
import java.util.List;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/42840
public class Number57 {
    public int[] solution(int[] answers) {
        int[] scores = getCount(answers);

        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (scores[i] == maxScore) {
                answer.add(i + 1);
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }

    public int[] getCount(int[] answers) {
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % 5]) {
                scores[0] = scores[0] + 1;
            }
            if (answers[i] == pattern2[i % 8]) {
                scores[1] = scores[1] + 1;
            }
            if (answers[i] == pattern3[i % 10]) {
                scores[2] = scores[2] + 1;
            }
        }

        return scores;
    }
}
