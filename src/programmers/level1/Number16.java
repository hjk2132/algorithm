package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12954
public class Number16 {
    public long[] solution(int x, int n) {
        long[] result = new long[n];
        long start = x;
        result[0] = x;

        for (int i = 1; i < n; ++i) {
            start = start + x;
            result[i] = start;
        }

        return result;
    }
}
