package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12943
public class Number23 {
    public int solution(int num) {
        long input = num;
        int count = 0;

        while(input > 1) {
            if (input % 2 == 0) {
                input = input / 2;
            } else {
                input = input * 3 + 1;
            }
            count = count + 1;

            if (count > 500) {
                count = -1;
                break;
            }
        }

        System.out.println(count);
        return count;
    }
}
