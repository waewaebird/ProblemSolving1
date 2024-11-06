package String.rev;

import java.util.Scanner;

public class Main6R {
    public static String solution(String input1) {
        String answer = "";


        for(int i = 0; i < input1.length() ; i++) {
            if(answer.indexOf(input1.charAt(i)) < 0) { //indexof 중복 문자열 찾는거...
                answer += input1.charAt(i);
            }
        }

        return answer;


        /*for(char ch : input1.toCharArray()) {
            int cnt = 0;

            for(char temp : answer.toCharArray()) {
                if(ch == temp) {
                    cnt++;
                }
            }

            if(cnt < 1) {
                answer += ch;
            }

        }
        return answer;*/
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }
}
