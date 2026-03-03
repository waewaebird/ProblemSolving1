package String.rev;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main6RRRRRRRRRRRR {
    // 중복문자제거
    public static String solution(String str) {
        Set<Character> sets = new LinkedHashSet<>();

        for(char x : str.toCharArray()) {
            sets.add(x);
        }

        String answer = "";
        for(char x : sets) {
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
