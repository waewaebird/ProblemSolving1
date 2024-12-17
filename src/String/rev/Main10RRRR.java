package String.rev;

import java.util.Scanner;

public class Main10RRRR {
    private static int[] solution(String s) {
        String[] temp = s.split(" ");
        String word = temp[0];
        String split = temp[1];

        int[] answer = new int[word.length()];

        int cnt = 200;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == split.charAt(0)) {
                cnt = 0;
            } else {
                cnt++;
            }
            answer[i] = cnt;
        }

        cnt = 200;
        for(int i = word.length()-1 ; i >= 0 ; i--) {
            if(word.charAt(i) == split.charAt(0)) {
                cnt = 0;
            } else {
                cnt++;
            }


            if(answer[i] > cnt) {
                answer[i] = cnt;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        for(int i : solution(s)) {
            System.out.print(i + " ");
        }
    }

}