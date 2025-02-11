package String.rev;

import java.util.Scanner;

public class Main9RRRR {
    public static int solution(String s) {
        String answer = "";
        for(char x : s.toCharArray()) {
            if(Character.isDigit(x)) {
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(solution(s));
    }
}
