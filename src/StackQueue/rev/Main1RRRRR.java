package StackQueue.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class Main1RRRRR {
    // 올바른 괄호
    public static String solution(String str) {
        String answer = "YES";

        Deque<Character> stack = new ArrayDeque<>();

        // push pop

        for(char x : str.toCharArray()) {
            if(x == '(') {
                stack.push(x);
            } else {
                if(stack.size() == 0) {
                    answer = "NO";
                    break;
                }
                stack.pop();
            }
        }

        if(stack.size() != 0) {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }
}
