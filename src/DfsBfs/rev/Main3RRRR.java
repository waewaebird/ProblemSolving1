package DfsBfs.rev;

import java.util.Scanner;

public class Main3RRRR {
    static class Solve {
        int p;
        int t;
        public Solve(int p, int t) {
            this.p = p;
            this.t = t;
        }
    }


    // 최대점수 구하기(DFS)
    static int N;
    static int M;
    static Solve[] solves;
    static int answer = Integer.MIN_VALUE;

    public static void DFS(int v, int p, int t) {
        if(t <= M) {
            answer = Math.max(answer,p);
        } else {
            return;
        }

        if(v == N) {
            return;
        } else {
            DFS(v + 1, p + solves[v].p , t + solves[v].t);
            DFS(v + 1, p, t);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        solves = new Solve[N];

        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            solves[i] = new Solve(a,b);
        }

        DFS(0,0,0);
        System.out.println(answer);
    }
}
