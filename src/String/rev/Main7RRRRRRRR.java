package String.rev;

import java.util.Scanner;

public class Main7RRRRRRRR {

    public static String solution(String s) {
        int lt = 0;
        int rt = s.length()-1;

        s = s.toLowerCase();

        while(lt <= rt) {
            if(s.charAt(lt) != s.charAt(rt)) {
                return "NO";
            }

            lt++;
            rt--;
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.next();
        System.out.println(solution(s));
    }
}
