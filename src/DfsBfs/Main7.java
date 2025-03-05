package DfsBfs;

import java.util.Scanner;

public class Main7 {
    static int[][] memo;
    static int[][] dy = new int[35][35];

    public static int DFS2(int n, int r) {
        if(dy[n][r] > 0) {
            return dy[n][r];
        }

        if(n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = DFS2(n-1, r-1) + DFS2(n-1, r);
        }
    }

    public static int DFS(int n, int r) {
        if(memo[n][r] > 0) {
            return memo[n][r];
        }

        if(n == r) {
            return 1;
        }
        if(r == 1) {
            return n;
        } else {
            int v = DFS(n-1,r-1) + DFS(n-1, r);
            memo[n][r] = v;
            return v;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int r = in.nextInt();

        memo = new int[n+1][n+1];

        System.out.println(DFS(n,r));
        System.out.println(DFS2(n,r));

    }
}
