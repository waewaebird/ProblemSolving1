package DfsBfs.rev;

import java.util.Scanner;

public class Main9RRRRRRRRRRRRR {
    // 조합 구하기
    static int N;
    static int K;
    static int[] combi;

    public static void DFS(int v, int start) {
        if(v == K) {
            for(int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
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
        K = in.nextInt();
        combi = new int[K];

        DFS(0,1);
    }
}
