package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/120831
public class Number9 {
    public int solution(int n) {
        int loop = n;
        int sum = 0;

        for (int i = 1; i <= loop; ++i) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        return sum;
    }
}
