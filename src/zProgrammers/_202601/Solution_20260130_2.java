package zProgrammers._202601;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution_20260130_2 {
    public int solution(int[] arr) {
        int answer = 0;

        Set<Integer> sets = new HashSet<>();
        for(int x : arr) {
            sets.add(x);
        }
        Integer[] array = sets.toArray(new Integer[0]);
        Arrays.sort(array);

        long max = 1;
        for(int x : array) {
            max *= x;
        }

        for (int i = 1; i <= max; i++) {
            int cnt = 0;
            for(int x : array) {
                if(i % x == 0) {
                    cnt++;
                } else {
                    break;
                }
            }

            if(cnt == array.length) {
                answer = i;
                break;
            }
        }


        if(arr.length == 1) {
            answer = arr[0];
        }

        return answer;
    }
}