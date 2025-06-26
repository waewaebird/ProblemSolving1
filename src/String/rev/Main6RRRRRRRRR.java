package String.rev;

import java.util.Scanner;

public class Main6RRRRRRRRR {
    // 중복문자제거
    public static String solution(String str) {
        String answer = "";

        for(char x: str.toCharArray()) {
            if (!answer.contains(String.valueOf(x))) {
                answer += x;
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
