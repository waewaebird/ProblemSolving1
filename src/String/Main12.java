package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Main12 {
    public static String solution2(int n, String s) {
        String answer = "";
        for(int i = 0 ; i<n ; i++) {
            String tmp = s.substring(0,7).replace("#","1").replace("*","0");
            int num = Integer.parseInt(tmp,2);
            answer+=(char)num;
            s=s.substring(7);
        }

        return answer;
    }

    public static String solution(int input1, String s) {
        StringBuilder answer = new StringBuilder();
        String temp = "";

        for(char c : s.toCharArray()) {
            if(c == "#".charAt(0)) {
                temp += "1";
            } else {
                temp += "0";
            }

            if(temp.length() ==7){
                answer.append((char)Integer.parseInt(temp,2));
                temp = "";
            }
        }

        return answer.substring(0,input1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        String input2 = in.next();
        System.out.println(solution(input1 ,input2));
    }
}













