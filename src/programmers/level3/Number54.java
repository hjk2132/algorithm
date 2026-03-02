package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12901?language=java
public class Number54 {
    public String solution(int a, int b) {
        int[] days = new int [] {0, 31, 29, 31, 30,
                31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayNames = {"FRI", "SAT", "SUN",
                "MON", "TUE", "WED", "THU"};
        int totalDays = 0;

        if (a == 1) {
            totalDays = b - 1;
        } else {
            for (int i = 1; i < a; ++i) {
                totalDays = totalDays + days[i];
            }
            totalDays = totalDays + b - 1;
        }

        return dayNames[totalDays % 7];
    }
}
