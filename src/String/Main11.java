package String;

import java.util.Scanner;

public class Main11 {
    public static String solution2(String s) {
        String answer = "";
        s =  s + " ";
        int cnt = 1;

        for(int i = 0 ; i<s.length()-1 ; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                cnt++;
            } else {
                answer+=s.charAt(i);
                if(cnt>1) {
                    answer+=String.valueOf(cnt);
                    cnt=1;
                }
            }
        }

        return answer;

    }


    public static String solution(String s) {
        String answer = "";
        int cnt = 1;

        for(int i = 0; i <s.length() ; i++) {
            if(i > 0) {
                if(s.charAt(i) != s.charAt(i-1)) {
                    if(cnt > 1) {
                        answer += String.valueOf(cnt);
                        cnt =1;
                    }
                    answer += s.charAt(i);
                } else {
                    cnt++;
                }

                if(i == s.length()-1) {
                    if(cnt > 1) {
                        answer += String.valueOf(cnt);
                    }
                }

            } else {
                answer += s.charAt(i);
            }
        }


        //KKHSSSSSSSE K2HS7E
        //KSTTTSEEKFKKKDJJGG KST3SE2KFK3DJ2G2

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        System.out.println(solution2(input1));
    }
}













