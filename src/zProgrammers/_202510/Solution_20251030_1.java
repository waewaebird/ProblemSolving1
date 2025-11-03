package zProgrammers._202510;

import java.util.Arrays;

class Solution_20251030_1 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);


        int sum = 0;
        int lt = 0;
        for (int rt = 0; rt < d.length; rt++) {
            answer++;
            sum += d[rt];

            if(sum >= budget) {
                break;
            }
        }

        if(sum > budget) {
            answer--;
        }

        return answer;
    }

}