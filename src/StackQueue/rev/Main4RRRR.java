package StackQueue.rev;

import java.util.Scanner;
import java.util.Stack;

public class Main4RRRR {
    // 후위식 연산(postfix)
    public static int solution(String s) {
        Stack<Integer> stack = new Stack<>();

        for(char x : s.toCharArray()) {
            if(Character.isDigit(x)) {
                stack.push(Integer.valueOf(String.valueOf(x)));
            } else {
                int a = stack.pop();
                int b = stack.pop();

                if(x == '+') {
                    stack.push(Integer.valueOf(String.valueOf(b+a)));
                } else if(x == '*') {
                    stack.push(Integer.valueOf(String.valueOf(b*a)));
                } else if(x == '-') {
                    stack.push(Integer.valueOf(String.valueOf(b-a)));
                } else if(x == '/') {
                    stack.push(Integer.valueOf(String.valueOf(b/a)));
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        System.out.println(solution(s));
    }
}
