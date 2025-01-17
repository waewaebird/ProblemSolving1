package String.rev;

import java.util.Scanner;

public class Main11R {
    // KKHSSSSSSSE
    // K2HS7E

    public static String solution(String s) {
        String answer = "";

        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i== s.length()-1) {
                if(s.charAt(i-1) == s.charAt(i)) {
                    answer += String.valueOf(cnt + 1);
                } else {
                    answer += s.charAt(i);
                }
                break;
            }

            if(cnt == 0){
                answer += s.charAt(i);
            }

            if(s.charAt(i) == s.charAt(i+1)) {
                cnt++;
            } else {
                cnt++;

                if(cnt != 1) {
                    answer += String.valueOf(cnt);
                }

                cnt = 0;
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

