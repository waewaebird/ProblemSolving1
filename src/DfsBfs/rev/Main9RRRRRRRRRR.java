package DfsBfs.rev;

import java.util.Scanner;

public class Main9RRRRRRRRRR {
    // 조합 구하기
    static int N;
    static int M;
    static int[] combi;

    public static void DFS(int v, int start) {
        if(v == M) {
            for(int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
            return;
        } else {
            for (int i = start; i <= N ; i++) {
                combi[v] = i;
                DFS(v+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        combi = new int[M];

        DFS(0,1);
    }
}
