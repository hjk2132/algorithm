package programmers.level2;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12922
public class Number31 {
    public String solution(int n) {
        String result = "";

        for (int i = 0; i < n; ++i) {
            if (i % 2 == 0) {
                result = result + "수";
            } else {
                result = result + "박";
            }
        }

        return result;
    }
}