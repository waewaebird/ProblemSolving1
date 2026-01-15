package String.rev;

import java.util.Scanner;

public class Main9RRRRRR {
    // 숫자만 추출
    public static int solution(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(solution(str));
    }
}
