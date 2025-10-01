package zProgrammers._202509;

import java.util.HashMap;
import java.util.Map;

class Solution_20250922_2 {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder("");

        Map<String, Integer> maps = new HashMap<>();
        maps.put("zero", 0);
        maps.put("one", 1);
        maps.put("two", 2);
        maps.put("three", 3);
        maps.put("four", 4);
        maps.put("five", 5);
        maps.put("six", 6);
        maps.put("seven", 7);
        maps.put("eight", 8);
        maps.put("nine", 9);

        StringBuilder temp = new StringBuilder("");
        for(char x : s.toCharArray()) {
            if(Character.isDigit(x)) {
                answer.append(x);
            } else {
                temp.append(x);
            }

            if(maps.get(temp.toString()) != null) {
                answer.append(maps.get(temp.toString()));
                temp = new StringBuilder("");

            }
        }

        return Integer.valueOf(answer.toString());
    }

    public static void main(String[] args) {
        Solution_20250922_2 s = new Solution_20250922_2();
        System.out.println(s.solution("2three45sixseven"));
    }
}