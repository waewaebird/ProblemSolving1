package zProgrammers;

import java.util.ArrayList;
import java.util.List;

class Solution_20260303_1 {
    public Integer[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for(int x : arr) {
            if(x >= 50 && x % 2 == 0) {
                list.add(x/2);
            } else if(x < 50 && x % 2 == 1){
                list.add(x*2);
            } else {
                list.add(x);
            }
        }

        return list.toArray(new Integer[0]);
    }
}