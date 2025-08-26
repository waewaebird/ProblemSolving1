package String.rev;

import java.util.Scanner;

public class Main8RRRRRRRRR {
    // 유효한 팰린드롬
    public static String solution(String str) {
        StringBuilder sample = new StringBuilder("");

        for(char x : str.toLowerCase().toCharArray()) {
            if(Character.isAlphabetic(x)) {
                sample.append(x);
            }
        }

        String a = sample.toString();
        String b = sample.reverse().toString();

        if(a.equals(b)) {
            return "YES";
        } else {
            return "NO";
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(solution(str));
    }
}
