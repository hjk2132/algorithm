package programmers.level4;

import java.util.HashMap;

// url : https://school.programmers.co.kr/learn/courses/30/lessons/178871
public class Number72 {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerIndex = new HashMap<>();

        // HashMap 입력
        for (int i = 0; i < players.length; ++i) {
            playerIndex.put(players[i], i);
        }

        for (int i = 0; i < callings.length; ++i) {
            Integer targetIndex = playerIndex.get(callings[i]);
            Integer frontIndex = targetIndex - 1;

            String target = players[targetIndex];
            String front = players[frontIndex];

            // players 원소 치환
            String temp = players[frontIndex];
            players[targetIndex - 1] = players[targetIndex];
            players[targetIndex] = temp;

            // playerIndex 갱신
            playerIndex.put(target, frontIndex);
            playerIndex.put(front, targetIndex);
        }

        return players;
    }
}
