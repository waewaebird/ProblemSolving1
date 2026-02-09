package zProgrammers._202601;

import java.util.Arrays;

class Solution_20260128_1 {
    public int solution(int number, int limit, int power) {
        int[] temp = new int[number];

        for (int i = 1; i <= number; i++) {
            int cnt = 1;
            for (int j = 1; j < i/2 + 1; j++) {
                if(i % j == 0) {
                    cnt++;
                }

                if(cnt > limit) {
                    cnt = power;
                    break;
                }
            }
            temp[i-1] = cnt;
        }

        return Arrays.stream(temp).sum();
    }
}