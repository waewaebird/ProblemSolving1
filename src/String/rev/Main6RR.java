package String.rev;

import java.util.Scanner;

public class Main6RR {
    public static String solution(String input1) {
        StringBuffer answer = new StringBuffer();

        for(char c : input1.toCharArray()) {
            if(answer.indexOf(String.valueOf(c)) == -1) {
                answer.append(c);
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }
}
