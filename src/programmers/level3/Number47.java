package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12915
public class Number47 {
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length - 1; ++i) {
            for (int j = 0; j < strings.length - 1 - i; ++j) {

                char first = strings[j].charAt(n);
                char second = strings[j+1].charAt(n);

                if (first == second) {
                    if (strings[j].compareTo(strings[j+1]) > 0) {
                        exchange(strings, j);
                    }
                } else if (first > second) {
                    exchange(strings, j);
                }
            }
        }

        return strings;
    }

    public String[] exchange(String[] strings, int index) {
        String temp = strings[index];
        strings[index] = strings[index+1];
        strings[index+1] = temp;

        return strings;
    }
}
