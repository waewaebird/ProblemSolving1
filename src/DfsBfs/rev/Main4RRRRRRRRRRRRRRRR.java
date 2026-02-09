package DfsBfs.rev;

import java.util.Scanner;

public class Main4RRRRRRRRRRRRRRRR {
    // 중복순열 구하기
    static int N;
    static int M;
    static int[] arr;

    public static void DFS(int v) {
        if(v == M) {
            for(int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= N; i++) {
                arr[v] = i;
                DFS(v+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();

        arr = new int[M];

        DFS(0);
    }
}
