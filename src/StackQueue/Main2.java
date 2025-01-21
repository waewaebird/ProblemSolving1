package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static String solution2(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(x == ')') {
                while(stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }
        for(int i = 0; i<stack.size(); i++) {
            answer+= stack.get(i);
        }

        return answer;
    }

    public static String solution(String s) {
        String answer = "";
        Stack<Character> st = new Stack<>();

        for(char x : s.toCharArray()) {
            if(x == '(') {
                st.push(x);
            } else if(x == ')'){
                if(!st.empty()) {
                    st.pop();
                }
            } else {
                if(st.empty()) {
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
