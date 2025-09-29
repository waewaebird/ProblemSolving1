package zProgrammers;

import java.util.ArrayList;
import java.util.List;

class Solution_20250929_1 {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[] {-1};
        } else {

            int min = Integer.MAX_VALUE;
            for(int x : arr) {
                min = Math.min(min, x);
            }

            List<Integer> answers = new ArrayList<>();
            for(int x : arr) {
                if(x != min) {
                    answers.add(x);
                }
            }

            int[] answer = new int[answers.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = answers.get(i);
            }


            return answer;
        }
    }
}