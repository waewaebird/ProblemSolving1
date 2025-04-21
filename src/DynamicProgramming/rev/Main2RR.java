package DynamicProgramming.rev;

import java.util.Scanner;

public class Main2RR {
    //돌다리 건너기
    public static int solution(int n) {
        int[] dy = new int[n+1];
        dy[0] = 0;
        dy[1] = 2;
        dy[2] = 3;

        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }

        return dy[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(solution(n));
    }
}
