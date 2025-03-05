package StackQueue.rev;

import java.util.Scanner;
import java.util.Stack;

public class Main5RR {
    public static int solution(String s) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();

                if(s.charAt(i-1) == ')') {
                    //막대기 괄호
                    answer++;
                } else {
                    //레이저 괄호
                    answer += stack.size();
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
