package programmers.level4;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/12951
public class Number76 {
    public String solution(String s) {
        String[] list = s.split(" ", -1);
        String answer = "";

        for (int i = 0; i < list.length; ++i) {
            list[i] = makeJarden(list[i]);

            if (i != list.length - 1) {
                answer = answer + list[i] + " ";
            } else {
                answer = answer + list[i];
            }
        }

        return answer;
    }

    public String makeJarden(String str) {
        if (str.isEmpty()) {
            return str;
        }

        if(Character.isDigit(str.charAt(0))) {
            str = str.toLowerCase();

            return str;
        } else {
            String firstLetter = str.substring(0,1);
            String restLetter = str.substring(1);

            firstLetter = firstLetter.toUpperCase();
            restLetter = restLetter.toLowerCase();

            str = firstLetter + restLetter;

            return str;
        }
    }
}
