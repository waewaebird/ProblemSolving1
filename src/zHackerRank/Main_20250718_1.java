package zHackerRank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main_20250718_1 {
    // Connected Cells in a Grid
    static int[] DI = {-1,-1,-1,0,0,1,1,1};
    static int[] DJ = {-1,0,1,-1,1,-1,0,1};
    static int[][] arr;
    static int N;
    static int M;
    static int answer = 0;

    public static void BFS(int v1, int v2) {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {v1, v2});

        int level = 1;
        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            for (int j = 0; j < 8; j++) {
                int n1 = temp[0] + DI[j];
                int n2 = temp[1] + DJ[j];

                if(n1 >= 0 && n1 < N && n2 >= 0 && n2 < M) {
                    if(arr[n1][n2] == 1) {
                        level++;
                        arr[n1][n2] = 2;
                        queue.offer(new int[] {n1,n2});
                    }
                }
            }
        }

        answer = Math.max(answer,level);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = in.nextInt();
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr[i][j] == 1) {
                    arr[i][j] = 2;
                    BFS(i,j);
                }
            }
        }

        System.out.println(answer);
    }
}
