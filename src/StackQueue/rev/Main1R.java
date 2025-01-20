package StackQueue.rev;

import java.util.Scanner;
import java.util.Stack;

public class Main1R {
    public static String solution(String s) {
        Stack<Character> st = new Stack<>();

        for (char x : s.toCharArray()) {
            if(x == '(') {
                st.push(x);
            } else if(x== ')') {
                if(st.empty()) {
                    return "NO";
                }
                st.pop();
            }
        }

        if(st.empty()) {
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
