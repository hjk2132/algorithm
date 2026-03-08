package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/131128?language=java
public class Number63 {
    public String solution(String X, String Y) {
        int[] list = getArr(X, Y);

        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < list[i]; j++) {
                sb.append(i);
            }
        }

        if (sb.length() == 0) {
            return "-1";
        }
        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }

    public int[] getArr(String x, String y) {
        String s = "";
        String l = "";
        int[] arr = new int[10];

        if (x.length() > y.length()) {
            s = y;
            l = x;
        } else {
            s = x;
            l = y;
        }

        StringBuilder lBuilder = new StringBuilder(l);

        for(int i = 0; i < s.length(); ++i) {
            String temp = s.substring(i, i+1);
            int idx = lBuilder.indexOf(temp);

            if(idx != -1) {
                arr[Integer.parseInt(temp)]++;
                lBuilder.deleteCharAt(idx);
            }
        }

        return arr;
    }
}
