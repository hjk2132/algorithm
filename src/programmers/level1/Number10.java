package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/120817
public class Number10 {
    public double solution(int[] numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.length; ++i) {
            sum += numbers[i];
        }

        double result = sum / numbers.length;
        System.out.println(result);

        return result;
    }
}
