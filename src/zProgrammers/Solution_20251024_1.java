package zProgrammers;

import java.util.HashMap;
import java.util.Map;

class Solution_20251024_1 {
    public String[] solution(String[] players, String[] callings) {
        Map<Integer, String> rank = new HashMap<>();
        Map<String, Integer> rank2 = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rank.put(i+1, players[i]);
            rank2.put(players[i], i+1);
        }

        for(String x : callings) {
            Integer nowRank = rank2.get(x);
            String previousMan = rank.get(nowRank - 1);

            rank.put(nowRank, previousMan);
            rank.put(nowRank-1, x);

            rank2.put(x, nowRank-1);
            rank2.put(previousMan, nowRank);
        }

        String[] answers = new String[players.length];
        for(Map.Entry<Integer, String> entry : rank.entrySet()) {
            answers[entry.getKey() -1] = entry.getValue();
        }

        return answers;
    }
}
