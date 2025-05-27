package DfsBfs.rev;

import java.util.Scanner;

public class Main7RRRRR {
    // 조합의 경우수(메모이제이션)
    static int N;
    static int R;
    static int[][] memo = new int[34][34];

    public static int DFS(int n, int r) {
        if(memo[n][r] >= 1) {
            return memo[n][r];
        }

        if(r == 1) {
            return memo[n][r] = n;
        }

        if(n == r) {
            return memo[n][r] = 1;
        } else {
            return memo[n][r] = DFS(n-1, r-1) + DFS(n-1,r);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        R = in.nextInt();

        System.out.println(DFS(N,R));
    }
}
