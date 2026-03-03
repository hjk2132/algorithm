package programmers.level3;

import java.util.Arrays;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/135808?language=java
public class Number56 {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int total = 0;

        for (int i = score.length - m; i >= 0; i = i - m) {
            total = total + score[i] * m;
        }

        return total;
    }
}
