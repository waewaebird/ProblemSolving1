package zProgrammers._202512;

import java.util.HashMap;
import java.util.Map;

class Solution_20251215_2 {
    public int solution(String before, String after) {
        int answer = 0;

        Map<Character, Integer> bm = new HashMap<>();
        for(char x : before.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }

        Map<Character, Integer> am = new HashMap<>();
        for(char x : after.toCharArray()) {
            am.put(x, am.getOrDefault(x, 0) + 1);
        }

        if(am.equals(bm)) {
            answer = 1;
        }

        return answer;
    }
}