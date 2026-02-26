package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/142086
public class Number50 {
    public int[] solution(String s) {
        int length = s.length();
        int[] answer = new int[length];

        for (int i = 0; i < length; ++i) {
            int distance = -1;
            char index = s.charAt(i);

            for (int j = 0; j < i; ++j) {
                char comp = s.charAt(j);

                if (index == comp) {
                    distance = i - j;
                }
            }
            answer[i] = distance;
        }

        return answer;
    }
}
