package DynamicProgramming;

import java.util.Scanner;

public class Main6 {
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
    static int answer = Integer.MIN_VALUE;

    public static void DFS(int v, int tsum, int psum) {
        if(tsum > M) {
            return;
        }

        if(v == N) {
            answer = Math.max(answer, psum);
        } else {
            DFS(v+1, tsum+arr[v].t, psum+arr[v].p);
            DFS(v+1, tsum, psum);
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
            arr[i] = new Problem(a,b);
        }

        DFS(0,0,0);
        System.out.println(answer);
    }
}
