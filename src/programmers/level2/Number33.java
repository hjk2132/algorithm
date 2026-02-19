package programmers.level2;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/77884
public class Number33 {
    public int countFactor(int input) {
        int count = 0;
        for (int i = 1; i <= input; ++i) {
            if (input % i == 0) {
                count++;
            }
        }
        return count;
    }

    public int solution(int left, int right) {
        int result = 0;

        for (int i = left; i <= right; ++i) {
            if(countFactor(i) % 2 == 0) {
                result = result + i;
            } else {
                result = result - i;
            }
        }

        return result;
    }
}
