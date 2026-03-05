package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/161989
public class Number59 {
    public int solution(int n, int m, int[] section) {

        int index = section[0];
        int count = 1;

        for (int i = 0; i < section.length; ++i) {
            if (section[i] >= index + m) {
                index = section[i];
                count = count + 1;
            }
        }

        return count;
    }
}
