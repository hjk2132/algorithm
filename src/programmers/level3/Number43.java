package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/147355
public class Number43 {
    public int solution(String t, String p) {
        int pLength = p.length();
        int tLength = t.length();
        long pLong = Long.parseLong(p);
        int count = 0;

        for (int i = 0; i < tLength - pLength + 1; ++i) {
            String str = t.substring(i, i + pLength);
            long subLong = Long.parseLong(str);

            if(subLong <= pLong) {
                count = count + 1;
            }
        }

        return count;
    }
}
