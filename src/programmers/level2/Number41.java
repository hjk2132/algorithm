package programmers.level2;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12930
public class Number41 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] arr = s.split("");

            int wordIdx = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(" ")) {
                    answer = answer + " ";
                    wordIdx = 0;
                } else {
                    if (wordIdx % 2 == 0) {
                        answer = answer + arr[i].toUpperCase();
                    } else {
                        answer = answer + arr[i].toLowerCase();
                    }
                    wordIdx++;
                }
            }

            return answer;
        }
    }
}
