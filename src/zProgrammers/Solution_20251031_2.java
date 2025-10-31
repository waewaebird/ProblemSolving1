package zProgrammers;

import java.util.ArrayList;
import java.util.List;

class Solution_20251031_2 {
    public static Integer[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n > 1) {
            if(n % 2 == 0) {
                n = n/2;
            } else {
                n = 3 * n + 1;
            }
            list.add(n);
        }

        return list.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Solution_20251031_2 s= new Solution_20251031_2();
        solution(10);
    }
}