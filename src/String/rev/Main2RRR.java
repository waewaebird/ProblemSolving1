package String.rev;

import java.util.Scanner;

public class Main2RRR {
    public static String solution(String input) {
        String answer  = "";

        for(char c : input.toCharArray()) {
            if(Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else if(Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            }
        }
        return answer;
    }


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(solution(input));
    }

}
