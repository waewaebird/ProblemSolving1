package DfsBfs.rev;

import java.util.Scanner;

public class Main6RRRRRRRRRRRRRRRRR {
    // 순열 구하기
    static int N;
    static int M;
    static int[] arr;
    static int[] pm;
    static int[] ch;

    public static void DFS(int v) {
        if(v == M) {
            for(int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < N; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    pm[v] = arr[i];
                    DFS(v+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();

        arr = new int[N];
        ch = new int[N];

        pm = new int[M];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        DFS(0);
    }
}
