package String.rev;

import java.util.Scanner;

public class Main1RRRRRRRRRRRR {
    // 문자 찾기
    public static int solution(String str, String s) {
        int answer = 0;
        for(char x : str.toLowerCase().toCharArray()) {
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
