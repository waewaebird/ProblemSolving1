package String.rev;

import java.util.Scanner;

public class Main7RRRR {
    public static String solution(String str){
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder(str);

        if(str.contentEquals(sb.reverse())) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }
}
