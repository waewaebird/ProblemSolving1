package DfsBfs.rev;

import java.util.Scanner;

public class Main3RRRRR {
    // 최대점수 구하기(DFS)
    static class Prob {
        int p;
        int t;
        public Prob(int p, int t) {
            this.p = p;
            this.t = t;
        }
    }

    static int N;
    static int R;
    static Prob[] arr;
    static int answer;

    public static void DFS(int v, int sum, int time) {
        if(time > R) {
            return;
        }

        answer = Math.max(answer, sum);

        if(v == N) {
            return;
        } else {
            DFS(v+1, sum + arr[v].p, time + arr[v].t);
            DFS(v+1, sum, time);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        R = in.nextInt();

        arr = new Prob[N];

        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            arr[i] = new Prob(a,b);
        }

        DFS(0,0,0);
        System.out.println(answer);

    }
}
