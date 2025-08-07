package String.rev;

import java.util.Scanner;

public class Main12RRRRRRRRR {
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
                answer += (char) Integer.parseInt(temp, 2);
                temp = "";
            }
        }
        return answer.substring(0,n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String str = in.next();

        System.out.println(solution(n,str));
    }
}
