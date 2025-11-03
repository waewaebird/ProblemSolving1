package StackQueue.rev;

import java.util.Scanner;

public class Main7RRRRRR {
    // 교육과정 설계
    public static String solution(String s, String str) {
        StringBuilder sb = new StringBuilder("");

        for(char x : str.toCharArray()) {
            if(s.contains(String.valueOf(x))) {
                sb.append(x);
            }
        }

        if(s.equals(sb.toString())) {
            return "YES";
        } else {
            return "NO";
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();
        String str = in.next();

        System.out.println(solution(s,str));
    }
}
