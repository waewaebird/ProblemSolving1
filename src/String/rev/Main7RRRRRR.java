package String.rev;

import java.util.Scanner;

public class Main7RRRRRR {
    public static String solution(String s) {
        String temp = s.toLowerCase();

        int lt = 0;
        int rt = s.length()-1;

        while(lt < rt) {
            if(temp.charAt(lt) != temp.charAt(rt)) {
                return "NO";
            }
            lt++;
            rt--;
        }

        return "YES";

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
    }
}