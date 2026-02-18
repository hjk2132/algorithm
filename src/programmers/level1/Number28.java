package programmers.level1;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/86051
public class Number28 {
    public int solution(int[] numbers) {
        int sum = 0;
        int [] checkList = new int[10];

        for (int i = 0; i < numbers.length; ++i) {
            checkList[numbers[i]] = 1;
        }

        for (int i = 0; i < checkList.length; ++i) {
            if (checkList[i] == 0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
        return sum;
    }
}
