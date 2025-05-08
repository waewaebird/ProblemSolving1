package DfsBfs.rev;

import java.util.Scanner;

public class Main3RRR {
    //최대점수 구하기(DFS)
    static class Problem {
        int p;
        int t;

        public Problem(int p, int t) {
            this.p = p;
            this.t = t;
        }
    }

    static int N;
    static int M;
    static Problem[] arr;
    static int answer = 0;

    public static void DFS(int v, int pSum, int tSum) {
        if(tSum > M) {
            return;
        }
        if(v == N){
            if(tSum <= M) {
                answer = Math.max(answer, pSum);
            }
            return;
        } else {
            DFS(v+1, pSum + arr[v].p, tSum + arr[v].t);
            DFS(v+1, pSum, tSum);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        arr = new Problem[N];

        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            arr[i] = new Problem(a, b);
        }
        DFS(0,0,0);

        System.out.println(answer);
    }
}
