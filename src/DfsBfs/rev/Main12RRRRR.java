package DfsBfs.rev;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main12RRRRR {
    // 토마토(BFS 활용)
    static int M;
    static int N;
    static int[][] arr;
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};

    public static Integer solution() {
        int answer = 0;
        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr[i][j] == 1) {
                    queue.offer(new int[] {i,j});
                }
            }
        }

        if(queue.size() == M*N) {
            return 0;
        }

        while(!queue.isEmpty()) {
            int len = queue.size();
            for (int q = 0; q < len; q++) {
                int[] temp = queue.poll();

                for (int k = 0; k < 4; k++) {
                    int v1 = temp[0] + DI[k];
                    int v2 = temp[1] + DJ[k];

                    if(v1 >= 0 && v1 < N && v2 >= 0 && v2 < M) {
                        if(arr[v1][v2] == 0) {
                            arr[v1][v2] = 1;
                            queue.offer(new int[]{v1,v2});
                        }
                    }
                }
            }
            answer++;
        }

        boolean all = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr[i][j] == 0) {
                    all = false;
                }
            }
        }

        if(!all) {
            return -1;
        } else {
            return answer-1;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        M = in.nextInt();
        N = in.nextInt();

        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution());

    }
}
