package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main5 {
    public static int solution2(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if(str.charAt(i-1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }
        return answer;
    }
    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();

        int answer = 0;

        int bar = 0;
        int leisure = 0;
        int i = 0;
        for(char x : s.toCharArray()) {
            if(x == '(') {
                if(s.charAt(i + 1) != ')') {
                   bar++;
                   answer++;
                }
                stack.push(x);
            } else {
                stack.pop();

                if(i > 0) {
                    if (s.charAt(i - 1) == '(') {
                        leisure++;
                    } else {
                        bar--;
                    }
                }
            }

            if(leisure > 0) {
                if(bar > 0) {

                    answer = answer+bar;

                }
                leisure--;
            }

            i++;
        }

        return answer;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s= in.next();

        System.out.println(solution(s));
    }
}
