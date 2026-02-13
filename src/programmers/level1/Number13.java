package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12931
public class Number13 {
    public int solution(int n) {
        String input = Integer.toString(n);
        int sum = 0;

        for (int i = 0; i < input.length(); ++i) {
            sum = sum + Character.getNumericValue(input.charAt(i));
        }

        System.out.println(sum);
        return sum;
    }
}
