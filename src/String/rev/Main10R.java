package String.rev;

import java.util.Scanner;

public class Main10R {
    public static int[] solution(String str1, String str2) {
        int[] answers = new int[str1.length()];
        char c = str2.charAt(0);

        int cnt = 1000;
        for(int i = 0; i <str1.length(); i++) {
            if(str1.charAt(i) == c) {
                answers[i] = 0;
                cnt = 0;
            } else {
                cnt++;
                answers[i] = cnt;
            }
        }

        cnt = 10000;
        for(int i = str1.length()-1 ; i > -1 ;  i--) {
            if(str1.charAt(i) == c) {
                answers[i] = 0;
                cnt = 0;
            } else {
                cnt++;
                answers[i] = Math.min(cnt, answers[i]);
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        for(int i : solution(str1, str2)) {
            System.out.print(i + " ");
        }
    }
}
