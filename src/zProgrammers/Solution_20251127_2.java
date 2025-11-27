package zProgrammers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution_20251127_2 {
    public String solution(String s) {
        String answer = "";

        Map<Character, Integer> map = new HashMap();

        for(char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x,0) + 1);
        }

        for(Character key : map.keySet()) {
            if(map.get(key) == 1) {
                answer += key;
            }
        }

        char[] arr = answer.toCharArray();
        Arrays.sort(arr);

        answer = "";
        for(char x : arr) {
            answer += x;
        }



        return answer;
    }


    public static void main(String[] args) {
        Solution_20251127_2 s = new Solution_20251127_2();
        s.solution("abcabcadc");
    }
}