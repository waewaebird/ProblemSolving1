package zProgrammers._202509;

import java.util.*;

class Solution_20250906_2 {
    static List<int[]> answers = new ArrayList<>();

    public static void DFS(int n, int from, int to, int via) {
        if(n == 1) {
            answers.add(new int[] {from, to});
        } else {
            DFS(n-1, from, via ,to);
            answers.add(new int[] {from, to});
            DFS(n-1, via ,to, from);
        }
    }

    public List<int[]> solution(int n) {
        DFS(n, 1, 3, 2);

        for(int[] x : answers) {
            System.out.println(Arrays.toString(x));
        }
        return answers;
    }
}