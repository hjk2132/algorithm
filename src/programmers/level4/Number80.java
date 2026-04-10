package programmers.level4;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12985
public class Number80 {
    public int solution(int n, int a, int b) {
        int p1 = a - 1;
        int p2 = b - 1;
        boolean isEnd = false;
        int roundCount = 1;

        while (!isEnd) {
            int newRoundIndex = 0;

            for (int i = 0; i < n; i = i + 2) {
                boolean hasP1 = (i == p1 || i + 1 == p1);
                boolean hasP2 = (i == p2 || i + 1 == p2);

                if (hasP1 && hasP2) {
                    isEnd = true;
                    break;
                } else if (hasP1) {
                    p1 = newRoundIndex;
                } else if (hasP2) {
                    p2 = newRoundIndex;
                }

                newRoundIndex++;
            }

            if (isEnd) {
                break;
            }

            n = n / 2;
            roundCount++;
        }

        return roundCount;
    }
}
