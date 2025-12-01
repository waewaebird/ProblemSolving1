package zProgrammers._202511;

import java.util.ArrayList;
import java.util.List;

class Solution_20251126_3 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int len = answer.length;
        for (int i = 0; i < len; i++) {
            int[] temp = commands[i];

            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= array.length; j++) {
                if(j >= temp[0] && j <= temp[1]) {
                    list.add(array[j-1]);
                }
            }
            list.sort(null);

            answer[i] = list.get(temp[2] -1);
        }

        return answer;
    }
}