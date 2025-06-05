package String.rev;

import java.util.Scanner;

public class Main5RRRRRRR {
    // 특정 문자 뒤집기
    public static String solution(String str) {
        char[] answers = str.toCharArray();

        int lt = 0;
        int rt = str.length()-1;

        while(lt <= rt) {
            if(!Character.isAlphabetic(str.charAt(lt))) {
                lt++;
                continue;
            }
            if(!Character.isAlphabetic(str.charAt(rt))) {
                rt--;
                continue;
            }
            answers[lt] = str.charAt(rt);
            answers[rt] = str.charAt(lt);

            lt++;
            rt--;
        }

        String answer = "";
        for(char x : answers) {
            answer += x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }
}
