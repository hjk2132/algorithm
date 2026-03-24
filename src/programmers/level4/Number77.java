package programmers.level4;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/70129
public class Number77 {
    public int[] solution(String s) {
        int loopCount = 0;
        int deletedZero = 0;

        while (!s.equals("1")) {
            int beforeLength = s.length();

            s = s.replace("0", "");

            int afterLength = s.length();

            deletedZero = deletedZero  + (beforeLength - afterLength);
            s = Integer.toBinaryString(afterLength);

            loopCount = loopCount + 1;
        }

        int[] answer = new int[2];
        answer[0] = loopCount;
        answer[1] = deletedZero;

        return answer;
    }
}
