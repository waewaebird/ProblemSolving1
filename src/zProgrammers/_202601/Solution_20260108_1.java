package zProgrammers._202601;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

class Solution_20260108_1 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Arrays.sort(strings);

        Map<Integer, Integer> ch = new LinkedHashMap<>();

        int index = 0;
        for(String x : strings) {
            ch.put(index, (int) x.charAt(n));
            index++;
        }

        int index2 = 0;
        for (int i = 97; i <= 122 ; i++) {
            for(Map.Entry<Integer, Integer> entry : ch.entrySet()){
                if(entry.getValue() == i) {
                    answer[index2] = strings[entry.getKey()];
                    index2++;
                }
            }
        }

        return answer;
    }
}