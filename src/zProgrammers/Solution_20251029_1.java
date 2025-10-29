package zProgrammers;

import java.util.ArrayList;
import java.util.List;

class Solution_20251029_1 {
    public Integer[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for(int x : arr) {
            if(x % divisor == 0) {
                list.add(x);
            }
        }

        if(list.size() == 0) {
            list.add(-1);
        }

        list.sort(null);
        return list.toArray(new Integer[list.size()]);
    }
}