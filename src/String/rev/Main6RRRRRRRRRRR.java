package String.rev;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main6RRRRRRRRRRR {
    // 중복문자제거
    public static String solution(String str) {
        String answer = "";
        Set<Character> sets = new HashSet<>();

        for(char x : str.toCharArray()) {
            if(!sets.contains(x)) {
                sets.add(x);
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
