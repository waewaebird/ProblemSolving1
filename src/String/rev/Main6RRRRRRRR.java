package String.rev;

import java.util.Scanner;

public class Main6RRRRRRRR {
    // 중복문자제거
    public static String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if(i == 0) {
                answer += str.charAt(i);
            } else {
                boolean flag = true;
                for (int j = i-1; j >= 0 ; j--) {

                    if(str.charAt(i) == str.charAt(j)) {
                        flag = false;
                    }
                }
                if(flag) {
                    answer += str.charAt(i);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }
}
