package programmers.level4;

import java.util.HashMap;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/160586
public class Number66 {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character,Integer> map = getMap(keymap);
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; ++i) {
            int num = getCount(map, targets[i]);

            answer[i] = num;
        }

        return answer;
    }

    public int getCount(HashMap<Character, Integer> keyMap, String str) {
        int count = 0;

        for (int i = 0; i < str.length(); ++i) {
            if (keyMap.containsKey(str.charAt(i))) {
                count = count + keyMap.get(str.charAt(i));
            } else {
                return -1;
            }
        }

        return count;
    }

    public HashMap<Character, Integer> getMap(String[] keymap) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; ++i) {
            for (int j = 0; j < keymap[i].length(); ++j) {
                char key = keymap[i].charAt(j);

                // 키가 있으면 index가 작은 경우에만 추가
                if (map.containsKey(key)) {
                    int num = map.get(key);

                    if (num > j) {
                        map.put(key, j+1);
                    }

                    continue;
                }
                // 키가 없으면 새롭게 추가
                map.put(key, j+1);
            }
        }

        return map;
    }
}
