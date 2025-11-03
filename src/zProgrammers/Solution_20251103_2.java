package zProgrammers;

import java.util.*;

public class Solution_20251103_2 {
    public int[] solution(int[] arr) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(int x : arr) {
            if(stack.isEmpty()) {
                stack.push(x);
            } else {
                if(stack.peek() != x) {
                    stack.push(x);
                }
            }
        }

        int[] answer = new int[stack.size()];

        int index = stack.size()-1;

        while(!stack.isEmpty()) {
            answer[index] = stack.pop();
            index--;
        }
        return answer;
    }

}