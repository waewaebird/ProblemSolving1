package zProgrammers;

import java.util.Arrays;

class Solution_20260616_1 {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().getAsDouble();
    }
}