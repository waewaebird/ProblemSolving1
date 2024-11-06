package String.rev;

import java.util.Scanner;

public class Main3R {
    public static String solution(String input) {
        String answer  = "";

        String[] arr = input.split(" ");

        for(String str : arr) {
            if(str.length() > answer.length()) {
                answer = str;
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
