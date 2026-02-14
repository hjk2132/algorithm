package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class Number19 {
    class Solution {
        public long solution(long n) {
            double sqrt = Math.sqrt(n);

            if (sqrt % 1 == 0) {
                return (long) ((sqrt+1)*(sqrt+1));
            } else {
                return -1;
            }
        }
    }
}
