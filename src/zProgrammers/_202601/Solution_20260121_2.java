package zProgrammers._202601;

import java.util.ArrayList;
import java.util.List;

class Solution_20260121_2 {
    public Integer[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answers = new ArrayList<>();

        for(String x : intStrs) {
            String temp = x.substring(s, s+l);

            int number = Integer.parseInt(temp);

            if(number > k) {
                answers.add(number);
            }
        }

        return answers.toArray(new Integer[0]);
    }
}