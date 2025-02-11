package StackQueue.rev;

import java.util.Scanner;
import java.util.Stack;

public class Main2R {
    public static String solution(String s) {
        String answer = "";

        Stack<Character> stack = new Stack<>();

        for(char x : s.toCharArray()) {
            if(x == '(') {
                stack.push(x);
            } else if(x == ')') {
                stack.pop();
            } else {
                if(stack.empty()) {
                    answer += x;
                }
            }


        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
    }
}
