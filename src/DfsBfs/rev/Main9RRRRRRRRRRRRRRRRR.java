package DfsBfs.rev;

import java.util.Scanner;

public class Main9RRRRRRRRRRRRRRRRR {
    // 조합 구하기
    static int N;
    static int M;
    static int[] arr;

    public static void DFS(int now, int start){
        if(now == M) {
            for(int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = start; i <= N; i++) {
                arr[now] = i;
                DFS(now+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        arr = new int[M];

        DFS(0,1);
    }
}
