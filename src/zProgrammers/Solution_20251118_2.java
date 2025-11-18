package zProgrammers;

import java.util.HashMap;
import java.util.Map;

class Solution_20251118_2 {
    public int solution(int[] array) {
        Map<Integer, Integer> maps = new HashMap<>();

        for(int x : array) {
            maps.put(x, maps.getOrDefault(x, 0) + 1);
        }

        int answer = 0;
        int max = 0;
        for(Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            if(entry.getValue() > max) {
                answer = entry.getKey();
                max = entry.getValue();
            }
        }

        int cnt = 0;
        for(Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            if(entry.getValue() == max) {
                cnt++;
            }
        }

        if(cnt > 1) {
            answer = -1;
        }

        return answer;
    }
}