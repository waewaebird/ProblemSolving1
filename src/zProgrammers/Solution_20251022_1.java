package zProgrammers;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution_20251022_1 {
    public String solution(String s) {
        List<String> temp = new ArrayList<>(Arrays.asList(s.split("")));
        temp.sort(Collections.reverseOrder());

        String answer = "";
        for(String x : temp) {
            answer += x;
        }

        return answer;
    }
}




