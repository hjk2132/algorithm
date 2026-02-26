package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/134240
public class Number51 {
    public String solution(int[] food) {
        String answer = "";
        int length = food.length;
        int[] count = new int[length];
        count[0] = 1;

        for (int i = 1; i < length; ++i) {
            if (food[i] % 2 == 0) {
                count[i] = food[i];
            } else {
                count[i] = food[i] - 1;
            }
        }

        for (int i = 1; i < count.length; ++i) {
            for (int j = 0; j < (count[i] / 2); ++j) {
                answer = answer + Integer.toString(i);
            }
        }
        answer = answer + "0";
        for (int i = 1; i < count.length; ++i) {
            for (int j = 0; j < (count[count.length - i] / 2); ++j) {
                answer = answer + Integer.toString(count.length - i);
            }
        }

        return answer;
    }
}
