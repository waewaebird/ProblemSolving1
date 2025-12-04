package String.rev;

import java.util.Scanner;

public class Main12RRRRRRRRRR {
    public static String solution(int n, String str) {
        String answer = "";
        int cnt = 0;

        StringBuilder sb = new StringBuilder("");
        for(char x : str.toCharArray()) {
            cnt++;
            if(x == '#') {
                sb.append('1');
            } else {
                sb.append('0');
            }

            if(sb.length() == 7) {
                int value = Integer.parseInt(sb.toString(), 2);
                answer += (char) value;
                sb = new StringBuilder();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();

        System.out.println(solution(n,str));
    }
}
