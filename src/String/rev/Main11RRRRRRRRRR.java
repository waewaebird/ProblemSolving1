package String.rev;

import java.util.Scanner;

public class Main11RRRRRRRRRR {
    // 문자열 압축
    public static String solution(String str) {
        String answer = "";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(i == 0) {
                answer += str.charAt(i);
                count++;
            } else {
                if(str.charAt(i) == str.charAt(i-1)) {
                    count++;
                } else {
                    if(count > 1) {
                        answer += count;
                    }

                    answer += str.charAt(i);

                    count = 1;
                }
            }
        }

        if(count > 1) {
            answer += count;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(solution(str));
    }
}
