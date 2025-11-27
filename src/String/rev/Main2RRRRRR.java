package String.rev;

import java.util.Scanner;

public class Main2RRRRRR {
    // 대소문자 변환
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) {
                sb.append(Character.toUpperCase(x));
            } else {
                sb.append(Character.toLowerCase(x));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }
}
