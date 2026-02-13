package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12932
public class Number17 {
    public int[] solution(long n) {
        String input = Long.toString(n);
        int length = input.length();
        int[] result = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            result[length - 1 - i]
                    = Character.getNumericValue(input.charAt(i));
        }

        return result;
    }
}
