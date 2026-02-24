package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/81301
public class Number46 {
    public int solution(String s) {

        String [] number = {"zero", "one", "two", "three", "four"
                , "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < number.length; i++) {
            s = s.replace(number[i], Integer.toString(i));
        }

        int result = Integer.parseInt(s);
        return result;
    }
}
