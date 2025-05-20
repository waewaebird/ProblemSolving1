package StackQueue.rev;

import java.util.Scanner;
import java.util.Stack;

public class Main5RRR {
    // 쇠막대기
    public static int solution(String str) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)  == '(') {
                stack.push(str.charAt(i));
            } else {
                stack.pop();

                if(str.charAt(i-1)  == '(') {
                    answer += stack.size();
                } else {
                    answer += 1;
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
