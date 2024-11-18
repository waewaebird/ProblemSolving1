package String.rev;

import java.util.Scanner;

public class Main3RR {
    public static String solution(String str) {
        String answer = "";
        String[] temp = str.split(" ");

        for(String c : temp) {
            if(c.length() > answer.length()) {
                answer = c;
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
