package DfsBfs.rev;

import java.util.Scanner;

public class Main4RRRRR {
    // 중복순열 구하기
    static int N;
    static int M;
    static int[] pm;

    public static void DFS(int v) {
        if(v == M) {
            for(int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= N; i++) {
                pm[v] = i;
                DFS(v+1);
            }

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();

        pm = new int[M];

        DFS(0);
    }
}
