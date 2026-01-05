package zProgrammers._202512;

import java.util.HashMap;
import java.util.Map;

class Solution_20251210_2 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        Map<Integer, Boolean> map = new HashMap<>();
        for(char x : skip.toCharArray()) {
            int temp = (int) x;
            map.put(temp, true);
        }

        // a == 97
        // z == 122

        for(char x : s.toCharArray()) {
            int now = (int) x;
            int next = now;

            int cnt = 0;
            while(cnt < index) {
                next++;

                if(next > 122) {
                    next = 97;
                }

                if(map.get(next) == null) {
                    cnt++;
                }
            }

            answer += (char) next;
        }

        return answer;
    }
}