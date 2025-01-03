package String.rev;

import java.util.Scanner;

public class Main9RRR {
    public static int solution(String s) {
        String answer = "";
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                answer += c;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(solution(s));
    }
}
