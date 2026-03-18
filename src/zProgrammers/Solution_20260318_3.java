package zProgrammers;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution_20260318_3 {
    public int solution(int[] ingredient) {
        int answer = 0;

        Deque<Integer> stack = new ArrayDeque<>();

        for(int x : ingredient) {
            if(stack.isEmpty()) {
                stack.push(x);
            } else {
                if(x == 1) {
                    if(stack.peek() == 3) {
                        int meet = stack.pop();
                        if(stack.size() > 0 && stack.peek() == 2) {
                            int vege = stack.pop();

                            if(stack.size() > 0 && stack.peek() == 1) {
                                stack.pop();
                                answer++;
                            } else {
                                stack.push(vege);
                                stack.push(meet);
                                stack.push(x);
                            }
                        } else {
                            stack.push(meet);
                            stack.push(x);
                        }
                    } else {
                        stack.push(x);
                    }
                } else {
                    stack.push(x);
                }
            }
        }

        return answer;
    }
}