package zProgrammers;

import java.util.ArrayList;
import java.util.List;

class Solution_20260112_2 {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(answer.isEmpty()) {
                answer.add(arr[i]);
            } else {
                if(arr[i] == answer.get(answer.size()-1)) {
                    answer.remove(answer.size()-1);
                } else {
                    answer.add(arr[i]);
                }
            }
        }

        if(answer.size() == 0) {
            answer.add(-1);
        }

        return answer;
    }
}