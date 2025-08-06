package StackQueue.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main1RRRRRR {
    // 올바른 괄호
    public static String solution(String s) {
        String answer = "YES";

        Deque<Character> stack = new ArrayDeque<>();
        for(char x : s.toCharArray()) {
            if(x == '(') {
                stack.push(x);
            } else {
                if(stack.size() < 1) {
                    answer = "NO";
                    break;
                } else {
                    stack.pop();
                }
            }
        }

        if(stack.size() > 0) {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        System.out.println(solution(s));
    }
}
