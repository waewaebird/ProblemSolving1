package zProgrammers._202509;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution_20250923_3 {
    public int[] solution(int[] numbers) {
        Set<Integer> sets = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                sets.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sets.size()];

        int i = 0;
        for(int x : sets) {
            answer[i] = x;
            i++;
        }

        Arrays.sort(answer);

        return answer;
    }
}