package programmers.level2;

import java.lang.Math;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/68935
public class Number40 {
    public int solution(int n) {
        int input = n;
        String answer = "";

        while(input > 0) {
            int rest = input % 3;
            input = input / 3;
            answer = answer + Integer.toString(rest);
        }

        int result = 0;

        for (int i = 0; i < answer.length(); ++i) {
            int num = Character.getNumericValue(answer.charAt(i));
            result = result + (int) (num * Math.pow(3, answer.length() - 1 - i));
        }

        System.out.println(result);
        return result;
    }
}
