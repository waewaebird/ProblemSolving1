package String;

import java.util.Scanner;

public class Main6 {
    public static String solution(String input) {
        String answer ="";

        for(int i= 0 ; i < input.length() ; i++) {
            if(answer.indexOf(input.charAt(i)) < 0) {
                answer += input.charAt(i);
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
