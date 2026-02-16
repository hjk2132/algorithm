package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12919
public class Number24 {
    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; ++i) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }

        return answer;
    }
}
