package programmers.level4;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12953
public class Number81 {
    public int solution(int[] arr) {
        int n = arr[arr.length - 1];
        boolean flag = true;

        while(true) {
            flag = true;

            for (int i = 0; i < arr.length; ++i) {
                if (n % arr[i] != 0) {
                    flag = false;
                }
            }

            if (flag == true) {
                break;
            }
            n = n + 1;
        }

        return n;
    }
}
