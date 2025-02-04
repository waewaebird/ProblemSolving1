package StackQueue.rev;

import java.util.Scanner;
import java.util.Stack;

public class Main4R {
    public static int solution(String s) {
        Stack<Integer> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            Integer a = 0;
            Integer b = 0;

            if(Character.isDigit(x)) {
                stack.push(Character.getNumericValue(x));
            } else {
                a = stack.pop();
                b = stack.pop();
                if(x == '+') {
                    stack.push(b+a);
                } else if(x == '-') {
                    stack.push(b-a);
                } else if(x == '*') {
                    stack.push(b*a);
                } else if(x == '/') {
                    stack.push(b/a);
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
