package String.rev;

import java.util.Scanner;

public class Main7R {
    public static String solution(String input1) {
        String answer = "YES";

        int lt = 0;
        int rt = input1.length()-1;

        input1 = input1.toLowerCase();

        while (lt < rt) {
            if(input1.charAt(lt) != input1.charAt(rt)) {
                return "NO";
            }
            lt++;
            rt--;
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }
}
