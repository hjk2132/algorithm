package programmers.level4;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/155652
public class Number67 {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder(s);

        for (int i = 0; i < answer.length(); ++i) {
            char change = getChar(answer.charAt(i), skip, index);
            answer.setCharAt(i, change);
        }

        return answer.toString();
    }

    public char getChar(char input, String skip, int index) {
        int count = 0;
        char temp = input;

        while(count < index) {
            temp = (char) ((int) temp + 1);
            if ((int) temp > 122) {
                temp = (char) 97;
            }

            String tStr = Character.toString(temp);

            if (!skip.contains(tStr)) {
                count = count + 1;
            }
        }

        return temp;
    }
}
