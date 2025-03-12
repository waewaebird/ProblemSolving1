package String.rev;

import java.util.Scanner;

public class Main8RRRRRR {
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        for(char x : s.toLowerCase().toCharArray()) {
            if(Character.isAlphabetic(x)) {
                sb.append(x);
            }
        }

        String temp1 = sb.toString();
        String temp2 = sb.reverse().toString();

        if(temp1.equals(temp2)) {
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
