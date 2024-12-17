package String.rev;

import java.util.Scanner;

public class Main6RRRRR {
    private static String solution(String s) {
        StringBuilder sb = new StringBuilder("");

        for(char c : s.toCharArray()) {
            if(sb.indexOf(String.valueOf(c)) < 0) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(solution(s));
    }

}
