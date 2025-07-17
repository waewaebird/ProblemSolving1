package StackQueue.rev;

import java.util.Scanner;

public class Main7RRRR {
    // 교육과정 설계
    public static String solution(String str1, String str2) {
        String temp = "";
        for(char x : str2.toCharArray()) {
            if(str1.contains(String.valueOf(x))) {
                temp += x;
            }
        }

        if(str1.equals(temp)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.next();
        String str2 = in.next();

        System.out.println(solution(str1,str2));
    }
}
