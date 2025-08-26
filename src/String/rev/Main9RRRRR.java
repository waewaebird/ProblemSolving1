package String.rev;

import java.util.Scanner;

public class Main9RRRRR {
    // 숫자만 추출
    public static Integer solution(String str) {
        StringBuilder sb = new StringBuilder("");

        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                sb.append(x);
            }
        }

        return Integer.valueOf(sb.toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }
}
