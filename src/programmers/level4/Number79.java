package programmers.level4;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/42842
public class Number79 {
    public int[] solution(int brown, int yellow) {

        for (int x = 3; x <= 5000; ++x) {
            for (int y = 3; y <= x; ++y) {

                if ((2 * x - 4 + 2 * y == brown) && (x * y - 2 * x - 2 * y + 4 == yellow)) {
                    return new int[]{x, y};
                }
            }
        }

        return new int[]{0, 0};
    }
}
