package zProgrammers._202601;

import java.util.Arrays;

class Solution_20260119_2 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = score.length-1; i >= 0; i--) {
            max++;
            min = Math.min(min, score[i]);

            if(max == m) {
                answer += min * max;
                max = 0;
            }
        }

        return answer;
    }
}



