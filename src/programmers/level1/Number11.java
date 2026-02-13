package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12937?language=java
public class Number11 {
    public String solution(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
            return "Even";
        } else {
            System.out.println("Odd");
            return "Odd";
        }
    }
}
