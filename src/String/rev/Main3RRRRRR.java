package String.rev;

import java.util.Scanner;

public class Main3RRRRRR {
    // 문장 속 단어
    public static String solution(String str) {
        String[] s = str.split(" ");

        String answer = "";
        for(String x : s) {
            if(x.length() > answer.length()) {
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(solution(str));
    }
}
