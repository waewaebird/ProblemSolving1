package StackQueue.rev;

import java.util.Scanner;
import java.util.Stack;

public class Main5RRRR {
    // 쇠막대기
    public static Integer solution(String str) {
        Integer answer = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                if(str.charAt(i-1) == '(') {
                    //레이저
                    stack.pop();
                    answer += stack.size();
                } else {
                    stack.pop();
                    answer++;
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
