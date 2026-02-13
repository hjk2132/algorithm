package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12928
public class Number14 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; ++i) {
            if (n % i == 0) {
                answer = answer + i;
            }
        }

        System.out.println(answer);
        return answer;
    }
}
