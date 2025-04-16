package DfsBfs.rev;

import java.util.Scanner;

public class Main7RR {
    static int[][] ch;

    public static int DFS(int n, int r) {
        if(ch[n][r] > 0) {
            return ch[n][r];
        }

        if(n == r) {
            return 1;
        }

        if(r == 1) {
            return n;
        }

        if(n == 1) {
            return 1;
        } else {
            return ch[n][r] = DFS(n-1, r-1) + DFS(n-1,  r);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();

        ch = new int[n+1][n+1];

        System.out.println(DFS(n,r));
    }
}
