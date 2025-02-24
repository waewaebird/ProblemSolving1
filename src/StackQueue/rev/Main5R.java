package StackQueue.rev;

import java.util.Scanner;
import java.util.Stack;


// (((()())(())()))
public class Main5R {
    public static int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if(s.charAt(i-1) == '(') {
                    answer = answer + stack.size();
                } else {
                    answer++;
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


/*
1. 여는 괄호는 무조건 PUSH

2. 닫는 괄호는(막대기의 끝을알리는 괄호인지, 레이저의 괄호인지 판별)
    - 바로 앞의 괄호가 닫는 괄호면 ,막대기의 괄호
    - 바로 앞의 괄호가 여는 괄호면 ,레이저
   1) 레이저는 한번 쐈음. 무조건 없에고 pop
    레이저면 남아있는 막대기 토막 누적
    막대기의 끝일 경우에는 +1.(레이저 아님)
*/