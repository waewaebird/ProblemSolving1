package String.rev;

import java.util.Scanner;

public class Main10RRR {
    private static int[] solution(String s) {
        String[] temp = s.split(" ");

        String word = temp[0];
        char w = temp[1].charAt(0);

        int[] answers = new int[word.length()];

        int cnt = 10000;
        for(int i = 0 ; i < word.length() ; i++) {
            if(word.charAt(i) != w) {
                cnt++;
            } else {
                cnt = 0;
            }
            answers[i] = cnt;
        }

        int ccnt = 10000;
        for(int i = word.length()-1 ; i >= 0 ; i--) {
            if(word.charAt(i) != w) {
                ccnt++;
            } else {
                ccnt = 0;
            }

            if(ccnt < answers[i]) {
                answers[i] = ccnt;
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        for(int u : solution(s)) {
            System.out.print(u + " ");
        }

    }

}