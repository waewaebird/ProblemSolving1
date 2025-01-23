package String.rev;

import java.util.Scanner;

public class Main11RR {
    public static String solution(String s) {
        String answer = "";

        int cnt=0;
        for (int i = 0; i < s.length(); i++) {
            if(i == 0) {
                answer += s.charAt(i);
                cnt = 1;
            } else {
                if(s.charAt(i) == s.charAt(i-1)) {
                    cnt++;
                    if(i == s.length()-1) {
                        answer += cnt;
                    }

                } else {
                    if(cnt > 1) {
                        answer += cnt;
                    }

                    answer += s.charAt(i);

                    cnt = 1;
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
