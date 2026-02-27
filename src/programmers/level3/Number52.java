package programmers.level3;

// https://school.programmers.co.kr/learn/courses/30/lessons/132267
public class Number52 {
    public int solution(int a, int b, int n) {
        int totalPayback = 0;
        int left = n;
        int threshold = a;
        int payback = b;

        while (left >= threshold) {
            left = left - threshold;
            left = left + payback;
            totalPayback = totalPayback + payback;
        }

        return totalPayback;
    }
}
