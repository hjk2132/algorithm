package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12944
public class Number12 {
    public double solution(int[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; ++i) {
            sum = sum + (double) arr[i];
        }

        double avg = sum / (double) arr.length;
        return avg;
    }
}
