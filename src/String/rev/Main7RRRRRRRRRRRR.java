package String.rev;

import java.util.Scanner;

public class Main7RRRRRRRRRRRR {
    // 회문 문자열
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str.toLowerCase()).reverse();

        String s = str.toLowerCase();

        if(s.equals(sb.toString())) {
            return "YES";
        } else {
            return "NO";
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(solution(str));
    }
}
