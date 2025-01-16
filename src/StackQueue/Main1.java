package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {
    public static String solution1(String s) {
        //Stack LIFO
        //Queue FIFO

        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {
            if(x == '(') {
                stack.push(x);
            } else {
                if(stack.isEmpty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()) {
            return "NO";
        }
        return answer;
    }

    public static String solution(String s) {
        int cnt = 0;

        if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') {
            return "NO";
        }

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                cnt++;
            } else {
                cnt--;
            }
        }

        if(cnt != 0) {
            return "NO";
        } else {
            return "YES";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();


        System.out.println(solution(s));
    }
}

//(()())