package String.rev;

import java.util.Scanner;

public class Main2RRRR {
    // 대소문자 변환
    public static String solution(String str) {
        StringBuilder answer = new StringBuilder("");

        for(char x : str.toCharArray()) {
            if(Character.isUpperCase(x)) {
                answer.append(String.valueOf(x).toLowerCase());
            } else {
                answer.append(String.valueOf(x).toUpperCase());
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }
}
