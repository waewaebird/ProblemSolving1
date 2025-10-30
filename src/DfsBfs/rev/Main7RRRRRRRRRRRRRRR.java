package DfsBfs.rev;

import java.util.Scanner;

public class Main7RRRRRRRRRRRRRRR {
    // 조합의 경우수(메모이제이션)
    static int[][] memo;

    public static int DFS(int n, int m) {
        if(n == 1) {
            return memo[n][m] = 1;
        }

        if(n == m) {
            return memo[n][m] = 1;
        }

        if(m == 1) {
            return memo[n][m] = n;
        }

        return memo[n][m] = DFS(n-1, m-1) + DFS(n-1 , m);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        memo = new int[n+1][n+1];

        System.out.println(DFS(n,m));
    }
}
