package zHackerRank._202505;

import java.util.Scanner;
import java.util.Stack;

public class Main_20250514_5 {
    //Super Reduced String
    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(stack.size() == 0) {
                stack.add(x);
            } else {
                if(stack.peek() == x) {
                    stack.pop();
                } else {
                    stack.push(x);
                }
            }
        }

        if(stack.size() == 0) {
            return "Empty String";
        } else {
            StringBuilder answer = new StringBuilder();

            while(!stack.isEmpty()) {
                answer.append(stack.pop());
            }

            return answer.reverse().toString();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }
}
