package DfsBfs.rev;

import java.util.Scanner;

public class Main7RRRRRRRRRRRR {
    // 조합의 경우수(메모이제이션)
    static int[][] memo;

    public static Integer DFS(int n, int r) {
        if(memo[n][r] > 0) {
            return memo[n][r];
        }

        if(n == r) {
            return memo[n][r] = 1;
        } else if(r == 1) {
            return memo[n][r] = n;
        } else {
            return memo[n][r] = DFS(n-1, r-1) + DFS(n-1,r);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();

        memo = new int[n+1][r+1];

        System.out.println(DFS(n,r));
    }
}
