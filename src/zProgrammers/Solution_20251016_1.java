package zProgrammers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution_20251016_1 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> maps = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(maps.get(s.charAt(i)) == null) {
                answer[i] = -1;
            } else {
                answer[i] = i - maps.get(s.charAt(i));
            }
            maps.put(s.charAt(i),i);
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}