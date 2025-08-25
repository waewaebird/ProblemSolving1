package DfsBfs.rev;

import java.util.Scanner;

public class Main4RRRRRRRRRRR {
    // 중복순열 구하기
    static int[] pm;

    public static void DFS(int v, int n, int m) {
        if(v == m) {
            for(int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[v] = i;
                DFS(v+1,n,m);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        pm = new int[m];

        DFS(0,n,m);
    }

}
