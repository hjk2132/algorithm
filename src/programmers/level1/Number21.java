package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12933?language=java
public class Number21 {
    class Solution {
        public boolean solution(int x) {
            int input = x;
            int sum = 0;

            while(input > 0) {
                int temp = input % 10;
                sum = sum + temp;
                input = input / 10;
            }

            if (x % sum == 0) {
                System.out.println("true");
                return true;
            } else {
                System.out.println("false");
                return false;
            }
        }
    }
}
