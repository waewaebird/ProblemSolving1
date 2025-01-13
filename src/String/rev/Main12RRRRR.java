package String.rev;

import java.util.Scanner;

public class Main12RRRRR {
    public static String solution(int n,  String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '#') {
                sb.append('1');
            } else{
                sb.append('0');
            }

            if(sb.length() == 7){
                int number = Integer.parseInt(sb.toString(), 2); //2진수 String을 10진수로 바꾼다
                answer += String.valueOf((char) number);
                sb = sb.delete(0, sb.length());
            }

            if(answer.length() == n) {
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
