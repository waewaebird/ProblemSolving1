package String.rev;

import java.util.Scanner;

public class Main3RRRRR {
    // 문장 속 단어
    public static String solution(String str) {
        String answer = "";

        int temp = 0;

        String[] strs = str.split(" ");
        for(String s : strs) {
            if(s.length() > temp) {
                answer = s;
                temp= s.length();
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
