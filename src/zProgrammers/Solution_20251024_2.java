package zProgrammers;

import java.util.HashMap;
import java.util.Map;

class Solution_20251024_2 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        Map<Character, Integer> skills = new HashMap<>();
        for (int i = 0; i < skill.length(); i++) {
            skills.put(skill.charAt(i), i);
        }

        for(String x : skill_trees) {
            Map<Character, Integer> st = new HashMap<>();
            int cnt = 0;
            for (int i = 0; i < x.length(); i++) {
                if(skills.get(x.charAt(i)) != null) {
                    st.put(x.charAt(i), i-cnt);
                } else{
                    cnt++;
                }
            }

            if(st.size() == skills.size()) {
                if(skills.equals(st)) {
                    answer++;
                }
            } else if(st.size() < skills.size()) {
                boolean flag = true;
                for(Map.Entry<Character, Integer> entry : st.entrySet()) {
                    Character key = entry.getKey();
                    Integer value = entry.getValue();

                    if(skills.get(key) != value) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    answer++;
                }
            }
        }

        return answer;
    }
}