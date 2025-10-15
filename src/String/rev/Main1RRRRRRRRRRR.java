package String.rev;

import java.util.Scanner;

public class Main1RRRRRRRRRRR {
    // 문자 찾기
    public static int solution(String str, String s) {
        int answer = 0;
        String l = str.toLowerCase();
        for(char x : l.toCharArray()) {
            if(x == s.toLowerCase().charAt(0)) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        String s = in.next();

        System.out.println(solution(str,s));
    }
}
