package String.rev;

import java.util.Scanner;

public class Main12RRRRRR {
    public static String solution(int n,  String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(char x : s.toCharArray()) {
            if(x == '#') {
                sb.append(1);
            } else {
                sb.append(0);
            }

            if(sb.length() == 7) {
                Integer temp = Integer.valueOf(sb.toString(),2);
                char c = (char) (int) temp;
                answer += c;
                sb = new StringBuilder("");
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
