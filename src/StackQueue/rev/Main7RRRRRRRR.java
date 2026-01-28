package StackQueue.rev;

import java.util.Scanner;

public class Main7RRRRRRRR {
    // 교육과정 설계
    public static String solution(String s, String str) {
        String temp = "";
        for(char x : str.toCharArray()) {
            if(s.contains(String.valueOf(x))) {
                temp += x;
            }
        }

        if(s.equals(temp)) {
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
