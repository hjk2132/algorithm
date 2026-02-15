package programmers.level1;

import java.util.Arrays;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12933?language=java
public class Number20 {
    public long solution(long n) {
        String inputStr = Long.toString(n);
        String newStr = "";
        int strLength = inputStr.length();

        char[] array = inputStr.toCharArray();
        Arrays.sort(array);

        for (int i = 1; i <= strLength; ++i) {
            newStr = newStr + array[strLength - i];
        }

        Long result = Long.parseLong(newStr);
        return result;
    }
}
