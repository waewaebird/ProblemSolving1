package zProgrammers._202511;

import java.util.Arrays;
import java.util.Collections;

class Solution_20251106_2
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);

        Integer[] Bt = new Integer[B.length];
        int index = 0;
        for(int x : B) {
            Bt[index] = x;
            index++;
        }

        Arrays.sort(Bt, Collections.reverseOrder());
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * Bt[i];
        }

        return answer;
    }
}