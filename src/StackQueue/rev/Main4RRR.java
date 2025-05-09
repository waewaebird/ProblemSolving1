package StackQueue.rev;

import java.util.Scanner;
import java.util.Stack;

public class Main4RRR {
    // 후위식 연산(postfix)
    public static int solution(String s) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(char x : s.toCharArray()) {
            if(Character.isDigit(x)) {
                stack.push(Character.digit(x,10));
            } else {
                int a = stack.pop();
                int b = stack.pop();

                if(x == '+') {
                    stack.push(b+a);
                } else if(x == '*') {
                    stack.push(b*a);
                } else if(x == '-') {
                    stack.push(b-a);
                } else if(x == '/') {
                    stack.push(b/a);
                }
            }
        }

        answer = stack.pop();
        return answer;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
    }


}
