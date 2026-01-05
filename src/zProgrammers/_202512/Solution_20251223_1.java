package zProgrammers._202512;

import java.util.Arrays;

class Solution_20251223_1 {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list , num_list.length+1);

        int a = num_list[num_list.length-1] * 2;
        if(num_list[num_list.length-1] > num_list[num_list.length-2]) {
            a = num_list[num_list.length-1] - num_list[num_list.length-2];
        }

        answer[num_list.length] = a;
        return answer;
    }
}