package DynamicProgramming.rev;

import java.util.Scanner;

public class Main6RRRR {
    // 최대점수 구하기(냅색 알고리즘)
    static class Prob {
        int point;
        int time;

        public Prob(int point, int time) {
            this.point = point;
            this.time = time;
        }
    }

    static int N;
    static int M;
    static Prob[] arr;
    static int answer = 0;

    public static void DFS(int v, int sumP, int sumT) {
        if(sumT > M) {
            return;
        }

        answer = Math.max(answer,sumP);

        if(v == N) {
            return;
        } else {
            DFS(v + 1, sumP + arr[v].point, sumT + arr[v].time);
            DFS(v + 1, sumP, sumT);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
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
