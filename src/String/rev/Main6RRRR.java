package String.rev;

import java.util.Scanner;

public class Main6RRRR {
    private static String solution(String s) {
        String answer = "";
        for(char c : s.toCharArray()) {
            if(answer.indexOf(String.valueOf(c)) < 0) {
                answer += c;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(solution(s));
    }


}
