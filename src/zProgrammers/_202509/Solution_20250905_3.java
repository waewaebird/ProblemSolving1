package zProgrammers._202509;

import java.util.ArrayList;
import java.util.List;

class Solution_20250905_3 {
    // 빈 배열에 추가, 삭제하기
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answers = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int len = arr[i];

            if(flag[i] == true) {
                for (int j = 0; j < len*2; j++) {
                    answers.add(arr[i]);
                }
            } else {
                for (int j = 0; j < len; j++) {
                    int last = answers.size() - 1;
                    answers.remove(last);
                }
            }
        }

        int[] a = new int[answers.size()];
        for (int i = 0; i < answers.size(); i++) {
            a[i] = answers.get(i);
        }

        return a;
    }
}