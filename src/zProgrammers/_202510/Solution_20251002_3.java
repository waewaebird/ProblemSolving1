package zProgrammers._202510;

import java.util.Arrays;

class Solution_20251002_3 {
    public double solution(int[] arr) {
        double answer = (double) Arrays.stream(arr).sum() / arr.length;
        return answer;
    }
}