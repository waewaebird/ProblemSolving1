package DfsBfs.rev;

import java.util.Scanner;

public class Main2RRR {
    // 바둑이 승차
    static int answer =  Integer.MIN_VALUE;

    public static void DFS(int c, int n, int[] arr, int v,  int sum) {
        if(sum <= c) {
            answer = Math.max(answer, sum);
        }

        if(v == n) {
            return;
        } else {
            DFS(c,n,arr, v+1, sum + arr[v]);
            DFS(c,n,arr, v+1, sum);
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int c = in.nextInt();
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        DFS(c,n,arr, 0, 0);

        System.out.println(answer);
    }
}
