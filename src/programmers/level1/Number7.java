package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/120806
public class Number7 {
    public int solution(int num1, int num2) {

        double div = (double) num1 / num2;
        int mul = (int) (div * 1000);

        return mul;
    }
}
