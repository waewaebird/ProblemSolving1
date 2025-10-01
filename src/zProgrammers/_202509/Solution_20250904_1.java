package zProgrammers._202509;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution_20250904_1 {
    boolean solution(String s) {
        boolean answer = true;

        Deque<Character> stack = new ArrayDeque<>();
        for(char x : s.toCharArray()) {
            if(x == '(') {
                stack.push(x);
            } else {
                if(stack.size() > 0) {
                    stack.pop();
                } else {
                    answer = false;
                    break;
                }
            }
        }

        if(stack.size() > 0) {
            answer = false;
        }
        return answer;
    }
}