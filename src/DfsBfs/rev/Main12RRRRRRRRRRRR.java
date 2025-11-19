package DfsBfs.rev;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main12RRRRRRRRRRRR {
    // 토마토(BFS 활용)
    static int M;
    static int N;
    static int[][] arr;

    public static int BFS(Queue<int[]> queue) {
        int[] DI = {-1,0,0,1};
        int[] DJ = {0,-1,1,0};

        int level = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int[] now = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int ni = now[0] + DI[j];
                    int nj = now[1] + DJ[j];

                    if(ni >= 0 && ni < N && nj >= 0 && nj < M) {
                        if(arr[ni][nj] == 0) {
                            arr[ni][nj] = 1;
                            queue.offer(new int[] {ni,nj});
                        }
                    }
                }
            }
            level++;
        }

        int answer = level - 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr[i][j] == 0) {
                    answer = -1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        M = in.nextInt();
        N = in.nextInt();
        arr = new int[N][M];

        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = in.nextInt();
                if(arr[i][j] == 1) {
                    queue.offer(new int[] {i,j});
                }
            }
        }

        if(queue.size() == M*N) {
            System.out.println(0);
        } else {
            System.out.println(BFS(queue));
        }
    }
}
