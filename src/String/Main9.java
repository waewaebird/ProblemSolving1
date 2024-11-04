package String;

import java.util.Scanner;

public class Main9 {
    public static int solution2(String s) {
        String answer ="";
        for(char x : s.toCharArray()) {
            if(Character.isDigit(x)) {
                answer+=x;
            }
        }
        return Integer.parseInt(answer);
    }

    public static Integer solution1(String s) {
        int answer =0;
        for(char x : s.toCharArray()) {
            if(x>=48 && x<=57) {
                answer = answer*10+(x-48);
            }
        }


        return answer;
    }

    public static Integer solution(String input) {
        String answer ="";

        for(int i= 0 ; i < input.length() ; i++) {
            if(!Character.isAlphabetic(input.charAt(i))) {
                answer += input.charAt(i);
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(solution(input));
    }

}
