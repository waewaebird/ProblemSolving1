package StackQueue.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main1RRRRRRRR {
    // 올바른 괄호
    public static String solution(String str) {
        String answer = "YES";
        Deque<Character> stack = new ArrayDeque<>();

        for(char x : str.toCharArray()) {
            if(x == '(') {
                stack.push('(');
            } else {
                if(stack.isEmpty()) {
                    answer = "NO";
                    break;
                } else {
                    stack.pop();
                }
            }
        }

        if(!stack.isEmpty()) {
            answer = "NO";
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }
}
