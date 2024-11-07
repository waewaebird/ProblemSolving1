package String.rev;

import java.util.Scanner;

public class Main7RR {
    public static String solution(String input1) {
        String answer = "YES";
        String str = input1.toLowerCase();

        int lt = 0;
        int rt = str.length()-1;

        while (lt < rt) {
            if(str.charAt(lt) != str.charAt(rt)) {
                return "NO";
            }
            lt++;
            rt--;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }
}
