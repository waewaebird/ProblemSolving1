package String.rev;

import java.util.Scanner;

public class Main7RRRRRRRRRR {

    public static String solution(String str) {
        String answer = "YES";

        int lt = 0;
        int rt = str.length() - 1;

        str = str.toLowerCase();

        while(lt <= rt) {
            if(str.charAt(lt) != str.charAt(rt)) {
                answer = "NO";
                break;
            }
            lt++;
            rt--;
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }
}
