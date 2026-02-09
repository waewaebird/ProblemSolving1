package zProgrammers._202601;

import java.util.HashMap;
import java.util.Map;

class Solution_20260105_3 {
    public int[] solution(String s) {
        String[] temp = s.substring(1,s.length()-1).replace("{", "").replace("}", "").split(",");

        int max = s.substring(1,s.length()-1).split("},").length;
        Map<Integer, Integer> maps = new HashMap<>();

        int[] answer = new int[max];
        for(String x : temp) {
            int n = Integer.parseInt(x);
            maps.put(n, maps.getOrDefault(n,0) + 1);
        }

        int index = 0;
        for (int i = max; i >= 1 ; i--) {
            for(Map.Entry<Integer, Integer> entry : maps.entrySet()) {
                if(entry.getValue() == i) {
                    answer[index] = entry.getKey();
                }
            }
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20260105_3 s = new Solution_20260105_3();
        //System.out.println(s.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")); // [2, 1, 3, 4]

        //System.out.println(s.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")); // [2, 1, 3, 4]

        System.out.println(s.solution("{{20,111},{111}}")); // [111, 20]

        System.out.println(s.solution("{{123}}")); // [123]

        System.out.println(s.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")); // [3, 2, 4, 1]



    }
}