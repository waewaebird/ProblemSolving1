package StackQueue.rev;

import java.util.Scanner;

public class Main7RRRRRRR {
    // 교육과정 설계
    public static String solution(String str, String s) {
        String a = "";

        for(char x : s.toCharArray()) {
            if(str.contains(String.valueOf(x))) {
                a += x;
            }
        }

        if(a.equals(str)) {
            return "YES";
        }else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String s = in.next();

        System.out.println(solution(str,s));
    }
}
