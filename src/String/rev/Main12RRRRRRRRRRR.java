package String.rev;

import java.util.Scanner;

public class Main12RRRRRRRRRRR {
    // 암호
    public static String solution(int n, String str) {
        String answer = "";
        String temp = "";

        for(char x : str.toCharArray()) {
            if(x == '#') {
                temp += '1';
            } else {
                temp += '0';
            }

            if(temp.length() == 7) {
                int a = Integer.valueOf(temp,2);
                answer += (char) a;

                temp = "";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String str = in.next();

        System.out.println(solution(n,str));
    }
}
