package programmers.level2;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12918
public class Number36 {
    public boolean solution(String s) {
        char[] charArr = s.toCharArray();

        if (charArr.length != 4 && charArr.length != 6) {
            return false;
        }

        for (int i = 0; i < charArr.length; ++i) {
            int ascii = (int) charArr[i];
            if ( (ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
                return false;
            }
        }

        return true;
    }
}