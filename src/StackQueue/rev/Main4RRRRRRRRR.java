package StackQueue.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main4RRRRRRRRR {
    // 후위식 연산(postfix)
    public static int solution(String str) {
        Deque<Integer> stack = new ArrayDeque<>();

        int a;
        int b;

        for(char x : str.toCharArray()) {
            if(x == '+') {
                a = stack.pop();
                b = stack.pop();
                stack.push(b + a);
            } else if(x == '-') {
                a = stack.pop();
                b = stack.pop();
                stack.push(b - a);
            } else if(x == '/') {
                a = stack.pop();
                b = stack.pop();
                stack.push(b / a);
            } else if(x == '*') {
                a = stack.pop();
                b = stack.pop();
                stack.push(b * a);
            } else {
                stack.push(Integer.valueOf(String.valueOf(x)));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(solution(str));
    }
}
