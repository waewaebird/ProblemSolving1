package String.rev;

import java.util.Scanner;

public class Main12RRRR {
    public static String solution(int n, String s) {
        String answer = "";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {

            // "" String / '' char


            if (s.charAt(i) == '#') {
                temp += "1";
            } else if (s.charAt(i) == '*'){
                temp += "0";
            }

            if(temp.length() == 7) {
                int number = Integer.valueOf(temp, 2);
                answer += (char) number;
                temp ="";
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


