package DfsBfs.rev;

import java.util.Scanner;

public class Main2RR {
    // 바둑이 승차
    static int c;
    static int n;
    static int answer = 0;
    static int[] arr;

    public static void DFS(int v, int sum) {
        if(sum > c) {
            return;
        }
        if(v==n) {
            answer = Math.max(answer,sum);
        } else {
            DFS(v+1, arr[v] + sum);
            DFS(v+1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        c = in.nextInt();
        n = in.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        DFS(0,0);

        System.out.println(answer);
    }
}
