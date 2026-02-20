package programmers.level2;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12940
public class Number39 {
    public int getGCD (int n, int m) {
        int max = 0;
        int big = n;
        int small = m;

        if (m > n) {
            big = m;
            small = n;
        }

        for (int i = 1; i <= small; ++i) {
            if (n % i == 0 && m % i == 0) {
                max = i;
            }
        }

        return max;
    }

    public int getLCM (int n, int m) {
        int big = n;
        int small = m;
        int result = n;

        if(m > n) {
            big = m;
            small = n;
            result = m;
        }

        while(true) {
            if (result % big == 0 && result % small == 0) {
                return result;
            }
            result++;
        }
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = getGCD(n, m);
        answer[1] = getLCM(n, m);

        return answer;
    }
}
