package String;

import java.util.Scanner;

public class Main2 {
    public static String solution(String input) {
        String output ="";

        for(char c : input.toCharArray()) {
            if(Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else {
                c = Character.toUpperCase(c);
            }
            output += c;
        }

        return output;

    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();


        System.out.println(solution(input));
    }
}
