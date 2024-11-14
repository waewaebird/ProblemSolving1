package String.rev;

import java.util.Scanner;

public class Main6RRR {
    public static String solution(String s) {
        String answer = "";

        for(char c : s.toCharArray()) {
            if(answer.indexOf(c)  <  0) {
                answer += c;
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
