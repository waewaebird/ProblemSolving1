package String.rev;

import java.util.Scanner;

public class Main12RRR {
    public static String solution(int n, String s) {
        String answer = "";
        String cs = s.replace("#", "1").replace("*","0");

        String temp = "";
        for(char c : cs.toCharArray()) {
            temp = temp + c;
            if(temp.length() == 7) {
                int code = Integer.parseInt(temp,2);
                answer = answer + (char) code;
                temp = "";
            }

            if(answer.length() >= n) {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        System.out.println(solution(n,s));
    }
}