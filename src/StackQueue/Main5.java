package StackQueue;

import java.util.Scanner;
import java.util.Stack;

// ()(((()())(())()))(())
// (()())
public class Main5 {
    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();

        int bar = 0;
        int leisure = 0;
        int i = 0;
        for(char x : s.toCharArray()) {
            if(x == '(') {
                if(s.charAt(i + 1) != ')') {
                   bar++;
                }
                stack.push(x);
            } else {
                stack.pop();

                if(i > 0) {
                    if (s.charAt(i - 1) == '(') {
                        leisure++;
                    }
                }
            }

            if(leisure > 0) {
                if(bar > 0) {

                    if(bar == 1) {
                        bar += 1;
                    } else {
                        bar = bar*2;
                    }


                }
                leisure--;
            }

            i++;
        }

        return bar;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s= in.next();

        System.out.println(solution(s));
    }
}
