package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/133499
public class Number62 {
    public int solution(String[] babbling) {
        int count = 0;

        for (String str : babbling) {
            if(checkString(str)) {
                count = count + 1;
            }
        }

        return count;
    }

    public boolean checkString(String str) {
        // aya, ye, woo, ma
        boolean[] checkList = new boolean[] {false, false, false, false};

        while(str.length() > 0) {
            if (str.indexOf("aya") == 0) {
                if (checkList[0] == false) {
                    checkList = new boolean[] {true, false, false, false};
                    str = str.substring(3, str.length());
                } else {
                    return false;
                }

            } else if (str.indexOf("ye") == 0) {
                if (checkList[1] == false) {
                    checkList = new boolean[] {false, true, false, false};
                    str = str.substring(2, str.length());
                } else {
                    return false;
                }

            } else if (str.indexOf("woo") == 0) {
                if (checkList[2] == false) {
                    checkList = new boolean[] {false, false, true, false};
                    str = str.substring(3, str.length());
                } else {
                    return false;
                }

            } else if (str.indexOf("ma") == 0) {
                if (checkList[3] == false) {
                    checkList = new boolean[] {false, false, false, true};
                    str = str.substring(2, str.length());
                } else {
                    return false;
                }

            } else {
                return false;
            }
        }

        return true;
    }
}
