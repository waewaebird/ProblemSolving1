package String.rev;

import java.util.Calendar;
import java.util.Scanner;

public class Main11RRR {
    public static String solution(String s) {
        String answer = "";

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i == 0) {
                answer += s.charAt(i);
                cnt++;
            } else {
                if(s.charAt(i) == s.charAt(i-1)) {
                    cnt++;
                } else {
                    if(cnt > 1) {
                        answer += String.valueOf(cnt);
                    }
                    cnt = 0;
                }

                if(cnt == 0) {
                    answer += s.charAt(i);
                    cnt++;
                }

                if(i == s.length()-1) {
                    if(cnt > 1) {
                        answer += String.valueOf(cnt);
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(solution(s));
    }
}


/*
KKHSSSSSSSE
K2HS7E
*/