package String.rev;

import java.util.Scanner;

public class Main2R {
    public static String solution(String input) {
        String answer = "";

        for(char cc : input.toCharArray()) {
            if(Character.isUpperCase(cc)) {
                answer += Character.toLowerCase(cc);
            } else if(Character.isLowerCase(cc)){
                answer += Character.toUpperCase(cc);
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
