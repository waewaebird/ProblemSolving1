package String.rev;

import java.util.Scanner;

public class Main7RRR {
    public static String solution(String str){
        String answer = "YES";
        int lt = 0;
        int rt = str.length()-1;
        while(lt < rt) {
            if(str.toLowerCase().charAt(lt) != str.toLowerCase().charAt(rt)) {
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
