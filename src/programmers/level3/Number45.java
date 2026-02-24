package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class Number45 {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; ++i) {
            int num = (int) arr[i];

            if (Character.isUpperCase(arr[i])) {
                if (num + n > 'Z') {
                    arr[i] = (char) (num + n - 26);
                } else {
                    arr[i] = (char) (num + n);
                }
            }

            else if (Character.isLowerCase(arr[i])) {
                if (num + n > 'z') {
                    arr[i] = (char) (num + n - 26);
                } else {
                    arr[i] = (char) (num + n);
                }
            }
        }

        String answer = String.valueOf(arr);

        return answer;
    }
}
