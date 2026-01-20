package String.rev;

import java.util.Scanner;

public class Main11RRRRRRRRRRRR {
    // 문자열 압축
    public static String solution(String str) {
        String answer = "";

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if(i == 0) {
                answer += str.charAt(i);
                cnt++;
            } else {
                if(str.charAt(i) == str.charAt(i-1)) {
                    cnt++;
                } else {
                    if(cnt > 1) {
                        answer += cnt;
                    }
                    cnt = 1;

                    answer += str.charAt(i);
                }
            }
        }

        if(cnt > 1) {
            answer += cnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }
}
