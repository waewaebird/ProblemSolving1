package StackQueue.rev;

import java.util.Scanner;
import java.util.Stack;

public class Main1RRRR {
    // 올바른 괄호
    public static String solution(String str) {
        boolean flag = true;
        Stack<Character> stack = new Stack<>();
        String answer = "NO";

        for(char x : str.toCharArray()) {
            if(x == '(') {
                stack.push(x);
            } else {
                if(stack.size() == 0) {
                    flag = false;
                    break;
                }
                stack.pop();
            }
        }

        if(stack.size() == 0) {
            answer = "YES";
        }

        if(!flag) {
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
