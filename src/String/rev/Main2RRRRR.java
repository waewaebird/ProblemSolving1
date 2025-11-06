package String.rev;

import java.util.Scanner;

public class Main2RRRRR {
    // 대소문자 변환
    public static String solution(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
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
