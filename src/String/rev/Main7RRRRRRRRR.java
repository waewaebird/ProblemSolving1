package String.rev;

import java.util.Scanner;

public class Main7RRRRRRRRR {
    // 회문 문자열
    public static String solution(String s) {
        String answer = "YES";

        String temp = s.toLowerCase();

        int lt = 0;
        int rt = temp.length()-1;

        while(lt <= rt) {
            if(temp.charAt(lt) != temp.charAt(rt)) {
                answer = "NO";
            }
            lt++;
            rt--;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        System.out.println(solution(s));
    }
}
