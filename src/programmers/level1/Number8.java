package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/120829
public class Number8 {
    public int solution(int angle) {

        int result = 0;

        if (angle > 0 && angle < 90) {
            result = 1;
        } else if (angle == 90) {
            result = 2;
        } else if (angle > 90 && angle < 180) {
            result = 3;
        } else if (angle == 180) {
            result = 4;
        } else {
            result = -1;
        }

        System.out.println(result);

        return result;
    }
}
