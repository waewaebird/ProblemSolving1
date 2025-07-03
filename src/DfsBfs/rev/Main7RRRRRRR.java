package DfsBfs.rev;

import java.util.Scanner;

public class Main7RRRRRRR {
    // 조합의 경우수(메모이제이션)
    static int[][] memo = new int[34][34];

    public static int DFS(int n, int r) {
        if(n == r) {
            return memo[n][r] = 1;
        }

        if(r == 1) {
            return memo[n][r] = n;
        }

        return memo[n][r] = DFS(n-1,r-1) + DFS(n-1, r);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int r = in.nextInt();

        System.out.println(DFS(n,r));
    }
}

