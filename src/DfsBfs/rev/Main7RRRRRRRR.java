package DfsBfs.rev;

import java.util.Scanner;

public class Main7RRRRRRRR {
    //조합의 경우수(메모이제이션)
    static int N;
    static int R;
    static int[][] memo;

    public static int DFS(int n, int r) {
        if(n == r) {
            return memo[n][r] = 1;
        }

        if(r == 1) {
            return memo[n][r] = n;
        }

        return memo[n][r] = DFS(n-1, r-1) + DFS(n-1,r);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        R = in.nextInt();

        memo = new int[N+1][R+1];

        System.out.println(DFS(N,R));
    }
}
