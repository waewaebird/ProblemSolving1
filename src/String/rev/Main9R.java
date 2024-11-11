package String.rev;

import java.util.Scanner;

public class Main9R {
    public static int solution(String str) {
        StringBuilder answer = new StringBuilder();
        for(char c : str.toCharArray()) {
           if(Character.isDigit(c)) {
               answer.append(c);
           }
        }
        return Integer.parseInt(answer.toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(solution(input));
    }
}
