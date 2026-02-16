package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class Number22 {
    class Solution {
        public long solution(int a, int b) {
            long sum = 0;
            int small;
            int large;

            if (a > b) {
                small = b;
                large = a;
            } else {
                small = a;
                large = b;
            }

            for (int i = small; i <= large; ++i) {
                sum = sum + i;
            }

            System.out.println(sum);
            return sum;
        }
    }
}
