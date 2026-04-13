package programmers.level4;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12914
public class Number82 {
    public long solution(int n) {
        return getHop(n);
    }

    public long getHop(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        long[] countList = new long[n+1];
        countList[0] = 0;
        countList[1] = 1;
        countList[2] = 2;

        for (int i = 3; i < countList.length; ++i) {
            countList[i]
                    = (countList[i-1] + countList[i-2]) % 1234567;
        }

        return countList[n];
    }
}
