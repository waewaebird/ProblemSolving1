package zProgrammers;

import java.util.HashMap;
import java.util.Map;


class Solution_20250926_3 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> maps = new HashMap<>();

        for(String s : participant) {
            maps.put(s, maps.getOrDefault(s, 0) + 1);
        }

        for(String s : completion) {
            if(maps.get(s) >= 1) {
                if(maps.get(s) == 1) {
                    maps.remove(s);
                } else {
                    maps.put(s, maps.get(s) - 1);
                }
            }
        }

        String answer = "";
        for(Map.Entry<String, Integer> entry : maps.entrySet()) {
            answer = entry.getKey();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20250926_3 s = new Solution_20250926_3();
        System.out.println(s.solution(new String[] {"leo", "kiki", "eden"} , new String[] {"eden", "kiki"}));
    }
}