package programmers.level3;

import java.util.ArrayList;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/77484
public class Number61 {
    public int[] solution(int[] lottos, int[] win_nums) {
        ArrayList<Integer> list = asList(lottos);
        int unknown = getZero(lottos);
        int count = 0;

        for (int i = 0; i < win_nums.length; ++i) {
            if (list.contains(win_nums[i])) {
                count = count + 1;
            }
        }

        int max = 7 - (count + unknown);
        int min = 7 - count;

        if (max > 6) {
            max = 6;
        }
        if (min > 6) {
            min = 6;
        }

        int[] answer = new int[2];
        answer[0] = max;
        answer[1] = min;

        return answer;
    }

    public int getZero(int[] lottos) {
        int count = 0;

        for (int i = 0; i < lottos.length; ++i) {
            if (lottos[i] == 0) {
                count = count + 1;
            }
        }

        return count;
    }

    public ArrayList<Integer> asList(int[] input) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : input) {
            list.add(i);
        }

        return list;
    }
}
