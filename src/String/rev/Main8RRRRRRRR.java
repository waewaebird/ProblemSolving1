package String.rev;

import java.util.Scanner;

public class Main8RRRRRRRR {
    // 유효한 팰린드롬
    public static String solution(String s) {
        String temp = "";

        for(char x : s.toCharArray()) {
            if(Character.isAlphabetic(x)) {
                temp += x;
            }
        }

        temp = temp.toLowerCase();

        StringBuilder sb = new StringBuilder(temp);
        String temp2= sb.reverse().toString();

        if(temp.equals(temp2)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        System.out.println(solution(s));
    }
}
