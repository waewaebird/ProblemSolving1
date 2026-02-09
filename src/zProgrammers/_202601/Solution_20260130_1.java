package zProgrammers._202601;

import java.util.Arrays;

class Solution_20260130_1 {
    public int[] solution(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                s = i;
                break;
            }
        }

        int e = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == 2) {
                e = i;
                break;
            }
        }

        int[] answer;
        if(s == 0 && e == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = Arrays.copyOfRange(arr,s,e+1);
        }

        return answer;
    }
}