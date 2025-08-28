package DfsBfs.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3RRRRRRRRRR {
    // 최대점수 구하기(DFS)
    static int N;
    static int M;
    static List<int[]> list = new ArrayList<>();
    static int answer = 0;

    public static void DFS(int v, int pSum, int tSum) {
        if(tSum > M) {
            return;
        }

        answer = Math.max(answer, pSum);

        if(v == N) {
            return;
        } else {
            DFS(v+1, pSum + list.get(v)[0], tSum + list.get(v)[1]);
            DFS(v+1, pSum, tSum);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        for (int i = 0; i < N; i++) {
            int point = in.nextInt();
            int time = in.nextInt();

            list.add(new int[] {point,time});
        }

        DFS(0,0,0);
        System.out.println(answer);
    }
}
