package String.rev;

import java.util.Scanner;

public class Main9RR {
    private static int solution(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuffer sf = new StringBuffer();

        for(char c : s.toCharArray()) {
            if(!Character.isAlphabetic(c)) {
                sb.append(c);
            }
        }
        return Integer.parseInt(String.valueOf(sb));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(solution(s));
    }
}
