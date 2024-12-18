package String.rev;

import java.util.Scanner;

public class Main3RRR {
    private static String solution(String s) {
        String[] arr = s.split(" ");
        String answer = "";
        for(String ss : arr) {
            if(ss.length() > answer.length()) {
                answer = ss;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(solution(s));
    }


}
