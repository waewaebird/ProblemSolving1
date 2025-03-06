package String.rev;

import java.util.Scanner;

public class Main12RRRRRRR {

    public static String solution(int n, String s){
        String answer = "";

        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '#') {
                temp+= '1';
            } else if(s.charAt(i) == '*') {
                temp+= '0';
            }

            if(temp.length() == 7) {
                int v = Integer.valueOf(temp, 2);
                char c = (char) v;
                answer += c;
                temp = "";
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
