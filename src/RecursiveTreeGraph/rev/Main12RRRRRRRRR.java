package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main12RRRRRRRRR {
    // 경로탐색(인접행렬)
    static int N;
    static int M;
    static int[][] arr;
    static int[] ch;
    static int answer = 0;

    public static void DFS(int v) {
        if(v == N) {
            answer++;
        } else {
            for (int i = 1; i <= N; i++) {
                int value = arr[v][i];

                if(value > 0) {
                    if(ch[i] == 0) {
                        ch[i] = 1;
                        DFS(i);
                        ch[i] = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();

        arr = new int[N+1][N+1];
        ch = new int[N+1];

        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            arr[a][b] = 1;
        }

        ch[1] = 1;
        DFS(1);

        System.out.println(answer);
    }
}
