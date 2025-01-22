package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main4 {
    public static int solution2(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char x : s.toCharArray()) {
            if(Character.isDigit(x)) {
                stack.push(x-48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();

                if(x == '+') {
                    stack.push(lt+rt);
                } else if(x == '-'){
                    stack.push(lt-rt);
                } else if(x == '*'){
                    stack.push(lt*rt);
                } else if(x == '/'){
                    stack.push(lt/rt);
                }
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static int solution(String s) {
        Stack<Integer> st = new Stack<>();

        for(char x : s.toCharArray()) {
            if(Character.isDigit(x)) {
                st.push(Integer.parseInt(String.valueOf(x)));
            } else {
                Integer a = st.pop();
                Integer b = st.pop();


                if(x == '+') {
                    int sum = a+b;
                    st.push(sum);
                } else if(x == '*') {
                    int multi = a*b;
                    st.push(multi);
                } else if(x == '-') {
                    int min = b-a;
                    st.push(min);
                } else {
                    int na = b/a;
                    st.push(na);
                }
            }
        }

        return st.peek();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.next();

        System.out.println(solution(s));

        
    }
}
