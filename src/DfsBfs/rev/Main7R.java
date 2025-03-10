package DfsBfs.rev;

import java.util.Scanner;

public class Main7R {
    static int[][] combi;

    public static int DFS(int n, int r) {
        if(combi[n][r] > 0) {
            return combi[n][r];
        }

        if(n == r || r == 0 || n == 1){
            return combi[n][r] = 1;
        } else {
            return combi[n][r] = DFS(n-1,  r-1) + DFS(n-1, r);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int r = in.nextInt();

        combi = new int[34][34];

        System.out.println(DFS(n,r));
    }
}

