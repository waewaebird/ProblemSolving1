package String.rev;

import java.util.ArrayList;
import java.util.Scanner;

public class Main12R {
    public static String solution(int n, String s) {
        String temp = "";
        String answers = "";

        for(char c : s.toCharArray()) {
            if(String.valueOf(c).equals("#")) {
                temp += "1";
            } else if(String.valueOf(c).equals("*")) {
                temp += "0";
            }


            if(temp.length() == 7) {
                int b = Integer.parseInt(temp,2);
                char aa = (char) b;

                answers += aa;
                temp ="";
            }

            if(answers.length() == n) {
                break;
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        System.out.println(solution(n ,s));
    }
}