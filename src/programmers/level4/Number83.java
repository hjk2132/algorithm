package programmers.level4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/138476
public class Number83 {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> tangerineList = new HashMap<>();

        for (int i = 0; i < tangerine.length; ++i) {
            if (tangerineList.containsKey(tangerine[i])) {
                Integer num = tangerineList.get(tangerine[i]);
                tangerineList.replace(tangerine[i], num + 1);
            } else {
                tangerineList.put(tangerine[i], 1);
            }
        }

        List<Entry<Integer, Integer>> toList = new ArrayList<>(tangerineList.entrySet());
        toList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int sum = 0;
        int count = 0;

        for (int i = 0; i < toList.size(); ++i) {
            sum = sum + toList.get(i).getValue();
            count = count + 1;

            if (sum >= k) {
                break;
            }
        }

        return count;
    }
}
