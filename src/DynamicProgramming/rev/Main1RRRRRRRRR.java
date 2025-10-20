package DynamicProgramming.rev;

import java.util.Scanner;

public class Main1RRRRRRRRR {
    // 계단오르기
    public static int solution(int n) {
        int[] dy = new int[n+1];


        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i-1] + dy[i-2];
        }

        return dy[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(solution(n));
    }
}
