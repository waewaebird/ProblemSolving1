package DfsBfs.rev;

import java.util.Scanner;

public class Main2RRRRRRR {
    // 바둑이 승차
    static int C;
    static int N;
    static int[] arr;
    static int answer = Integer.MIN_VALUE;

    public static void DFS(int v, int sum) {
        if(sum > C) {
            return;
        } else {
            answer = Math.max(answer,sum);
        }

        if(v == N) {
            return;
        } else {
            DFS(v+1, sum + arr[v]);
            DFS(v+1, sum );
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        C = in.nextInt();
        N = in.nextInt();

        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        DFS(0,0);
        System.out.println(answer);
    }
}
