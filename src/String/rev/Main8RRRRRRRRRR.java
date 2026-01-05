package String.rev;

import java.util.Scanner;

public class Main8RRRRRRRRRR {
    // 유효한 팰린드롬
    public static String solution(String str) {
        String a = "";
        for(char x : str.toLowerCase().toCharArray()) {
            if(Character.isAlphabetic(x)) {
                a += x;
            }
        }

        String b = new StringBuilder(a).reverse().toString();

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
