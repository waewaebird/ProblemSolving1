package StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7 {
    public static String solution2(String need, String plan){
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();

        for(char x : need.toCharArray()) {
            Q.offer(x);
        }

        for(char x : plan.toCharArray()) {
            if(Q.contains(x)) {
                //필수과목이다
                if(x!=Q.poll()){
                    return "NO";
                }
            }
        }
        if(!Q.isEmpty()){
            return "NO";
        }
        return answer;
    }

    public static String solution(String str, String s){
        String answer = "";
        for (int i = 0; i < s.length(); i++) {

            if(str.contains(String.valueOf(s.charAt(i)))) {
                answer += String.valueOf(s.charAt(i));
            }
        }

        if(answer.equals(str)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String s = in.next();

        System.out.println(solution(str, s));
    }
    /*CBA
            CGEADB*/

}
