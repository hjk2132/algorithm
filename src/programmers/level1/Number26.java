package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/76501
public class Number26 {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < absolutes.length; ++i) {
            if (signs[i]) {
                sum = sum + absolutes[i];
            } else {
                sum = sum - absolutes[i];
            }
        }

        return sum;
    }
}