package zHackerRank;

import java.util.Scanner;

public class Main_20250514_4 {
    //Strong Password
    static String numbers = "0123456789";
    static String lower_case = "abcdefghijklmnopqrstuvwxyz";
    static String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String special_characters = "!@#$%^&*()-+";

    public static int solution(int n, String str) {
        int nc = 0;
        int lc = 0;
        int uc = 0;
        int sc = 0;

        for(char x : str.toCharArray()) {
            if(numbers.contains(Character.toString(x))) {
                nc++;
            } else if(lower_case.contains(Character.toString(x))) {
                lc++;
            } else if(upper_case.contains(Character.toString(x))) {
                uc++;
            } else if(special_characters.contains(Character.toString(x))) {
                sc++;
            }
        }

        int cnt = 0;
        if(nc < 1) {
            cnt++;
        }
        if(lc < 1) {
            cnt++;
        }
        if(uc < 1) {
            cnt++;
        }
        if(sc < 1) {
            cnt++;
        }

        if(n < 6) {
            if(cnt < 6-n) {
                cnt = 6-n;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String str = in.next();

        System.out.println(solution(n,str));
    }

}
