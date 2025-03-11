package String.rev;

import java.util.Scanner;

public class Main1RRRRR {
    public static int solution(String s, String a) {
        int answer = 0;
        String temp = s.toLowerCase();

        for(char x : temp.toCharArray()) {
            if(x == a.toLowerCase().charAt(0)) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String a = in.nextLine();

        System.out.println(solution(s,a));
    }

}
