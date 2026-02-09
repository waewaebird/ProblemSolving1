package zProgrammers._202601;

import java.util.HashMap;
import java.util.Map;

class Solution_20260116_3 {
    public int solution(String[] babbling) {
        // "aya", "ye", "woo", "ma"
        int answer = 0;

        for(String x : babbling) {
            if(x.contains("ayaaya") || x.contains("yeye") || x.contains("woowoo") || x.contains("mama")) {
                continue;
            }

            Map<String, Integer> map = new HashMap<>();
            map.put("aya" , 1);
            map.put("ye" , 1);
            map.put("woo" , 1);
            map.put("ma" , 1);

            if(map.get(x) != null) {
                answer++;
            } else {
                for(String temp : map.keySet()) {
                    if(x.contains(temp)) {
                        String replacement = "";

                        for (int i = 0; i < temp.length(); i++) {
                            replacement += " ";
                        }

                        x = x.replace(temp, replacement);
                    }
                }

                if(x.trim().equals("")) {
                    answer++;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution_20260116_3 s = new Solution_20260116_3();

        System.out.println(s.solution(new String[] {"yayae"}));
    }
}