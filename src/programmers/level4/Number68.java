package programmers.level4;

import java.util.ArrayList;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/133502
public class Number68 {
    public int solution(int[] ingredient) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < ingredient.length; ++i) {
            list.add(ingredient[i]);

            if (list.size() >= 4) {
                int size = list.size();

                if (list.get(size - 4) == 1 &&
                        list.get(size - 3) == 2 &&
                        list.get(size - 2) == 3 &&
                        list.get(size - 1) == 1)
                {
                    count++;

                    list.remove(size - 1);
                    list.remove(size - 2);
                    list.remove(size - 3);
                    list.remove(size - 4);
                }
            }
        }

        return count;
    }
}
