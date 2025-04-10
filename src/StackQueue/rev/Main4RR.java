package StackQueue.rev;

import java.util.Scanner;
import java.util.Stack;

public class Main4RR {

    public static int solution(String s) {
        Stack<Integer> stack = new Stack<>();


        for(char x: s.toCharArray()) {
            if(Character.isDigit(x)) {
                stack.push(Character.getNumericValue(x));
            } else {

                int a = stack.pop();
                int b = stack.pop();

                int result = 0;
                if(x == '+') {
                    result = b+a;
                } else if(x == '-') {
                    result = b-a;
                } else if(x == '*') {
                    result = b*a;
                } else if(x == '/') {
                    result = b/a;
                }

                stack.push(result);
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
