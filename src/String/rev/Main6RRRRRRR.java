package String.rev;

import java.util.Scanner;

public class Main6RRRRRRR {

    public static String solution(String s) {
        String answer = "";

        for(char x : s.toCharArray()) {
            if(!answer.contains(String.valueOf(x))) {
                answer += x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));

    }

}
