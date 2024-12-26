package Array.rev;

import java.util.Scanner;

public class Main4RRRR {
    public static int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for(int i = 2 ; i < n ; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int an : solution(n)) {
            System.out.print(an + " ");
        }
    }
}
