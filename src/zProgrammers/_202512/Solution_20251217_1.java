package zProgrammers._202512;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution_20251217_1 {
    static int[] Ns;
    static int T;
    static char[] arr = {'+','-'};

    static Map<String, Integer> memo;

    public static int DFS(int v, int sum) {
        if(v == Ns.length) {
            if(sum == T) {
                return 1;
            } else {
                return 0;
            }
        }

        String key = v + "_" + sum;

        if(memo.containsKey(key)) {
            return memo.get(key);
        }

        int count = 0;
        for (int i = 0; i < 2; i++) {
            int now = 0;
            if(arr[i] == '+') {
                now = Ns[v] *1;
            } else {
                now = Ns[v] *-1;
            }
            count += DFS(v + 1, sum + now);
        }

        memo.put(key, count);
        return count;
    }

    public int solution(int[] numbers, int target) {
        Ns = Arrays.copyOf(numbers, numbers.length);
        T = target;

        memo = new HashMap<>();

        return DFS(0, 0);
    }

    public static void main(String[] args) {
        Solution_20251217_1 s = new Solution_20251217_1();
        System.out.println(s.solution(new int[] {1,1,1,1,1} , 3)); // 5
        System.out.println(s.solution(new int[] {4,1,2,1} , 4)); // 2

    }
}