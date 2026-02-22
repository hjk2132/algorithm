package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/131705?language=java
public class Number42 {
    public int solution(int[] number) {
        int size = number.length;
        int count = 0;

        for (int i = 0; i < size - 2; ++i) {
            for (int j = i + 1; j < size - 1; ++j) {
                for (int k = j + 1; k < size; ++k) {
                    if (number[i] + number[j] + number[k] == 0) {
                        count = count + 1;
                    }
                }
            }
        }

        return count;
    }
}
