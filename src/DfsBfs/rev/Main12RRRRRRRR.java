package DfsBfs.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main12RRRRRRRR {
    // 토마토(BFS 활용)
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};
    static int M;
    static int N;
    static int[][] arr;
    static int answer = 0;

    public static void BFS(Deque<int[]> deque) {
        int level = 0;

        while(!deque.isEmpty()) {
            int len = deque.size();

            for (int i = 0; i < len; i++) {
                int[] temp = deque.poll();

                for (int j = 0; j < 4; j++) {
                    int n1 = temp[0] + DI[j];
                    int n2 = temp[1] + DJ[j];

                    if(n1 >= 0 && n1 < N && n2 >= 0 && n2 < M) {
                        if(arr[n1][n2] == 0) {
                            arr[n1][n2] = 1;
                            deque.offer(new int[] {n1,n2});
                        }
                    }
                }
            }
            level++;
        }

        boolean flag = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr[i][j] == 0) {
                    flag = false;
                }
            }
        }

        if(!flag) {
            answer= -1;
        } else {
            answer = level -1;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        M = in.nextInt();
        N = in.nextInt();

        arr = new int[N][M];

        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = in.nextInt();
                if(arr[i][j] == 1) {
                    deque.offer(new int[] {i,j});

                }
            }
        }

        if(deque.size() == M*N) {
            System.out.println(0);
        } else {
            BFS(deque);
            System.out.println(answer);
        }
    }
}
