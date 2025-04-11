package String.rev;

import java.util.Scanner;

public class Main11RRRRR {
    //문자열 압축
    public static String solution(String s) {
        String answer = "";

        int cnt = 1;
        for (int i = 0; i < s.length(); i++) {
            if(i == 0) {
                answer += s.charAt(0);
            } else {
                if(s.charAt(i) == s.charAt(i-1)) {
                    cnt++;
                    if(i == s.length()-1) {
                        if(cnt > 1) {
                            answer += String.valueOf(cnt);
                        }
                    }
                } else {
                    if(cnt > 1) {
                        answer += String.valueOf(cnt);
                        cnt = 1;
                    }
                    answer += s.charAt(i);
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

// KST3SE2KFK3DJ2G
// KST3SE2KFK3DJ2G2