package zProgrammers;

import java.util.HashMap;
import java.util.Map;

class Solution_20251103_1 {
    boolean solution(String s) {
        boolean answer = true;

        Map<Character, Integer> maps = new HashMap<>();

        for(char x : s.toLowerCase().toCharArray()) {
            maps.put(x, maps.getOrDefault(x, 0) + 1);
        }

        if(maps.get('p') != maps.get('y')) {
            answer = false;
        }

        return answer;
    }
}