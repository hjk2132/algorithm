package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12948
public class Number27 {
    public String solution(String phone_number) {
        String input = phone_number;
        char[] temp = input.toCharArray();

        for (int i = 0; i < temp.length; ++i) {
            if (i < temp.length - 4) {
                temp[i] = '*';
            }
        }

        String result = String.valueOf(temp);
        return result;
    }
}
