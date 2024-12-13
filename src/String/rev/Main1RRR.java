package String.rev;

import java.util.Scanner;

public class Main1RRR {
    protected static int solution(String s1,  String s2) {
        int answer = 0;

        for(char c : s1.toLowerCase().toCharArray()) {
            if(c == s2.toLowerCase().charAt(0)) {
                answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        System.out.println(solution(s1, s2));
    }

}
