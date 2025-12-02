package zProgrammers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

class Solution_20251202_3 {
    public int solution(String s) {
        int answer = 0;
        Queue<Character> queue = new ArrayDeque<>();
        for(char x : s.toCharArray()) {
            queue.offer(x);
        }

        for (int i = 0; i < s.length(); i++) {

            Queue<Character> tq = new ArrayDeque<>(queue);

            char cx = tq.peek();
            if(cx != ')' && cx != '}' && cx != ']') {
                Deque<Character> stack = new ArrayDeque<>();
                boolean flag = true;
                while(!tq.isEmpty()) {
                    char x = tq.poll();
                    if(x == '(' || x == '{' || x == '[') {
                        stack.push(x);
                    } else {
                        if(stack.isEmpty()) {
                            flag = false;
                            break;
                        }
                        char sx = stack.peek();
                        if(x == ')') {
                            if(sx == '(') {
                                stack.pop();
                            }
                        } else if(x == '}') {
                            if(sx == '{') {
                                stack.pop();
                            }
                        } else if(x == ']') {
                            if(sx == '[') {
                                stack.pop();
                            }
                        }
                    }
                }

                if(flag && stack.isEmpty()) {
                    answer++;
                }

            }

            queue.offer(queue.poll());
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20251202_3 s = new Solution_20251202_3();

        System.out.println(s.solution("[](){}"));
        System.out.println(s.solution("}]()[{"));
        System.out.println(s.solution("[)(]"));
        System.out.println(s.solution("}}}"));

    }
}