package String.rev;

import java.util.Scanner;

public class Main10RRRRR {
    public static int[] solution(String s) {
        String[] arr = s.split(" ");
        String str = arr[0];

        int[] answer = new int[arr[0].length()];

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != arr[1].charAt(0)) {
                cnt++;
            } else {
                cnt = 0;
            }
            if(i == 0) {
                answer[i] = 200;
            } else {
                answer[i] = cnt;
            }

        }

        cnt = 0;
        for (int i = str.length()-1 ; i >= 0; i--) {
            if(str.charAt(i) != arr[1].charAt(0)) {
                cnt++;
            } else {
                cnt = 0;
            }

            if(i == str.length()-1) {
                continue;
            } else {
                if(answer[i] > cnt) {
                    answer[i] = cnt;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        for (int x : solution(s)) {
            System.out.print(x + " ");
        }
    }
}
