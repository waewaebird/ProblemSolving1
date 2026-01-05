package zProgrammers._202512;

import java.util.ArrayList;
import java.util.List;

class Solution_20251230_2 {
    public List<Integer> solution(int n, int k) {
        List<Integer> answers = new ArrayList<>();
        for (int i = k; i <= n; i = i+k) {
            answers.add(i);
        }
        return answers;
    }
}