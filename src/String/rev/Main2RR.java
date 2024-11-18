package String.rev;

import java.util.Scanner;

public class Main2RR {
    public static String solution(String str) {
        String answer = "";
        for(char c : str.toCharArray()) {
            if(Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();

        System.out.println(solution(input1));

    }
}
