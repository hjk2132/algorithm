package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12903
public class Number30 {
    public String solution(String s) {
        int mid = s.length() / 2;
        String result = "";
        if (s.length() % 2 == 0) {
            result = s.substring(mid-1, mid+1);
        } else {
            result = s.substring(mid, mid+1);
        }
        return result;
    }
}
