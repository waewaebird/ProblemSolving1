package String.rev;

import java.util.Scanner;

public class Main7RRRRRRRRRRR {
    // 회문 문자열
    public static String solution(String str) {
        String temp = new StringBuilder(str).reverse().toString().toLowerCase();

        str = str.toLowerCase();

        if(str.equals(temp)) {
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
