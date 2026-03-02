package programmers.level3;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/159994
public class Number55 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < goal.length; ++i) {
            int findIndex1 = getIndex(cards1, goal[i]);
            int findIndex2 = getIndex(cards2, goal[i]);

            if (findIndex1 != -1) {
                if (findIndex1 == index1 + 1) {
                    index1 = findIndex1;
                } else {
                    return "No";
                }
            }

            if (findIndex2 != -1) {
                if (findIndex2 == index2 + 1) {
                    index2 = findIndex2;
                } else {
                    return "No";
                }
            }
        }

        return "Yes";
    }

    public int getIndex(String[] cards, String input) {
        for (int i = 0; i < cards.length; ++i) {
            if (cards[i].equals(input)) {
                return i;
            }
        }

        return -1;
    }
}
