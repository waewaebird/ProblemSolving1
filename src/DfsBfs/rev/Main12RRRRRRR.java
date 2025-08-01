package DfsBfs.rev;

import java.util.*;

public class Main12RRRRRRR {
    // 토마토(BFS 활용)
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};
    static int M;
    static int N;
    static int[][] arr;

    public static int solution(Deque<int[]> queue) {
        int answer = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int[] temp = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int next1 = temp[0] + DI[j];
                    int next2 = temp[1] + DJ[j];

                    if(next1 >= 0 && next1 < N && next2 >= 0 && next2 < M) {
                        if(arr[next1][next2] == 0) {
                            arr[next1][next2] = 1;
                            queue.offer(new int[] {next1,next2});
                        }
                    }
                }
            }

            answer++;
        }

        boolean isAll = false;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(arr[i][j] == 0) {
                    isAll = true;
                }
            }
        }

        if(isAll) {
            answer = 0;
        }

        return answer - 1;
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

                if(arr[i][j] == 1) {
                    queue.offer(new int[] {i,j});
                }
            }
        }

        if(queue.size() == N*M) {
            System.out.println(0);
        } else {
            System.out.println(solution(queue));
        }
    }

}
