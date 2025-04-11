package DfsBfs.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main12RRR {
    //토마토
    static int M;
    static int N;
    static int[][] arr;
    static int[] dN = {-1, 0, 0, 1};
    static int[] dM = {0, -1, 1, 0};
    static int answer = 0;

    public static void BFS() {
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr[i][j] == 1) {
                    queue.offer(new int[] {i,j});
                }
            }
        }

        int level = 0;
        while (!queue.isEmpty()) {
            boolean flag = false;
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int[] temp = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nN = temp[0] + dN[j];
                    int nM = temp[1] + dM[j];

                    if(nN >= 0 && nN < N && nM >= 0 && nM < M)  {
                        if(arr[nN][nM] == 0) {
                            arr[nN][nM] = 1;
                            queue.offer(new int[] {nN,nM});
                            flag = true;
                        }
                    }
                }
            }
            if(flag) {
                level++;
            }
        }

        answer = level;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        M = in.nextInt();
        N = in.nextInt();

        arr = new int[N][M];

        int all = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = in.nextInt();

                if(arr[i][j] == 1) {
                    all++;
                }
            }
        }

        if(all == M*N) {
            System.out.println(0);
        } else {
            BFS();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if(arr[i][j] == 0) {
                        answer = -1;
                    }
                }
            }


            System.out.println(answer);
        }

        /*for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}
