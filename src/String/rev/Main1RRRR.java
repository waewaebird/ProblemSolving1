package String.rev;

import java.util.Scanner;

public class Main1RRRR {
    public static int solution(String s1, String s2) {
        int cnt = 0;
        for(char x : s1.toLowerCase().toCharArray()) {
            if(x == s2.toLowerCase().charAt(0)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        System.out.println(solution(s1, s2));
    }
}
