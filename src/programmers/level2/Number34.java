package programmers.level2;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12917
public class Number34 {
    public String solution(String s) {
        char[] charArr = s.toCharArray();

        for (int i = 0; i < charArr.length - 1; ++i) {
            for (int j = 0; j < charArr.length - 1 - i; ++j) {
                int first = (int) charArr[j];
                int second = (int) charArr[j+1];

                if (first < second) {
                    char temp = charArr[j];
                    charArr[j] = charArr[j+1];
                    charArr[j+1] = temp;
                }
            }
        }

        String answer = new String(charArr);
        return answer;
    }
}
