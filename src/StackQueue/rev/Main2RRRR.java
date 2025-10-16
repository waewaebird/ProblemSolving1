package StackQueue.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main2RRRR {
    // 괄호문자제거
    public static String solution(String str) {
        String answer = "";

        Deque<Character> stack = new ArrayDeque<>();

        for(char x : str. toCharArray()) {
            if(x == '(') {
                stack.push('(');
            } else if(x == ')'){
                stack.pop();
            } else {
                if(stack.size() == 0) {
                    answer += x;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(solution(str));
    }
}
