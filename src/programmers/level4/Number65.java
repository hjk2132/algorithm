package programmers.level4;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/140108
public class Number65 {
    public int solution(String s) {
        char standard = s.charAt(0);
        int same = 1;
        int diff = 0;
        int count = 0;

        for (int i = 1; i < s.length(); ++i) {
            char index = s.charAt(i);

            if (standard != index) {
                diff = diff + 1;
            } else {
                same = same + 1;
            }

            if (same == diff) {
                if (i != s.length() - 1) {
                    count = count + 1;
                    standard = s.charAt(i+1);
                } else {
                    count = count + 1;
                }

                same = 0;
                diff = 0;
            }
        }

        if (same != diff) {
            count = count + 1;
        }

        return count;
    }
}
