package String.rev;

import java.util.Scanner;

public class Main12RRRRRRRR {
    // 암호
    public static String solution(int n, String str) {
        String answer = "";

        int cnt = 0;
        String temp = "";
        for(char x : str.toCharArray()) {
            if(x == '#') {
                temp += '1';
            } else if(x == '*') {
                temp += '0';
            }
            cnt++;
            if(cnt == 7) {
                int ascii = Integer.parseInt(temp,2);

                answer += (char) ascii;

                temp = "";
                cnt = 0;
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
        String str = in.next();

        System.out.println(solution(n,str));
    }
}
