package StackQueue.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main4RRRRRRRRRR {
    // 후위식 연산(postfix)
    public static int solution(String str) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                stack.push(Integer.valueOf(String.valueOf(x)));
            } else {
                int a = stack.pop();
                int b = stack.pop();

                if(x == '+') {
                    stack.push(b+a);
                } else if(x == '-') {
                    stack.push(b-a);
                } else if(x == '/') {
                    stack.push(b/a);
                } else if(x == '*') {
                    stack.push(b*a);
                }
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
