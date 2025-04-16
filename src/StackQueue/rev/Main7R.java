package StackQueue.rev;

import java.util.Scanner;

public class Main7R {
    //교육과정 설계
    public static String solution(String s, String str) {
        String word = "";

        for(char x : str.toCharArray()) {
            if(s.contains(String.valueOf(x))) {
                word += x;
            }
        }

        String answer = "NO";
        if(word.equals(s)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String str = in.next();

        System.out.println(solution(s,str));
    }
}
