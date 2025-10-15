package String.rev;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main6RRRRRRRRRR {
    // 중복문자제거
    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        Set<Character> set = new LinkedHashSet<>();

        for(char x : str.toCharArray()) {
            set.add(x);
        }

        for(Character x : set) {
            answer.append(x);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(solution(str));
    }
}
