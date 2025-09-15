package zProgrammers;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution_20250915_2 {
    public int[] solution2(int[] prices) {
        int[] answer = new int[prices.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < prices.length; i++) {
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int index = stack.pop();
                answer[index] = i - index;
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = prices.length -1 - index;
        }

        return answer;
    }

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int idx1 = i;
            int idx2 = prices.length-1;

            for (int j = i+1; j < prices.length; j++) {
                if(prices[i] > prices[j]) {
                    idx2 = j;
                    break;
                }
            }

            answer[i] = idx2 - idx1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20250915_2 s = new Solution_20250915_2();

        System.out.println(Arrays.toString(s.solution2(new int[] {1,2,3,2,3})));
    }
}