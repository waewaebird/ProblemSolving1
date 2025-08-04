package DfsBfs.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main12RRRRRRRRR {
    // 토마토(BFS 활용)
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};
    static int M;
    static int N;
    static int[][] arr;

    public static int BFS(Deque<int[]> queue) {
        int level = 0;

        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int[] temp = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int ni = temp[0] + DI[j];
                    int nj = temp[1] + DJ[j];

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

        boolean isAll = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr[i][j] == 0) {
                    isAll = false;
                    break;
                }
            }
        }

        if(!isAll) {
            level = 0;
        }

        return level-1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        M = in.nextInt();
        N = in.nextInt();
        arr = new int[N][M];

        Deque<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = in.nextInt();
                if (arr[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        if (queue.size() == N * M) {
            System.out.println(0);
        } else {
            System.out.println(BFS(queue));
        }
    }
}
