package StackQueue.rev;

import java.util.Scanner;
import java.util.Stack;

public class Main1RR {
    public static String solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(char x : s.toCharArray()) {
            if(x == '(') {
                stack.push(x);
            } else {
                if(stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            }
        }

        if(stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
    }
}
