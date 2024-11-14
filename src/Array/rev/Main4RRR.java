package Array.rev;

import java.util.Scanner;

public class Main4RRR {
    public static int[] solution(int n) {
        int[] answers = new int[n];

        for(int i = 0 ; i < n ; i++) {
            if(i == 0 || i == 1) {
                answers[i] = 1;
            } else {
                answers[i] = answers[i-2] + answers[i-1];
            }
        }
        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int nn : solution(n)) {
            System.out.print(nn + " ");
        }
    }

}
