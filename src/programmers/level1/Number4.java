package programmers.level1;

// url: https://school.programmers.co.kr/learn/courses/30/lessons/120820
public class Number4 {
    public int solution(int age) {
        int baseYear = 2022;
        int birth = 2022 - age + 1;

        System.out.println(birth);
        return birth;
    }
}
