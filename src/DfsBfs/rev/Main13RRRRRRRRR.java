package DfsBfs.rev;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main13RRRRRRRRR {
    // 섬나라 아일랜드
    static int N;
    static int[][] arr;

    public static void BFS(int v1, int v2){
        int[] DI = {-1,-1,-1,0,0,1,1,1};
        int[] DJ = {-1,0,1,-1,1,-1,0,1};

        Queue<int[]> queue = new ArrayDeque<>();
        arr[v1][v2] = 2;
        queue.offer(new int[] {v1,v2});

        while(!queue.isEmpty()) {
            int[] now = queue.poll();

            for (int i = 0; i < 8; i++) {
                int next0 = now[0] + DI[i];
                int next1 = now[1] + DJ[i];

                if(next0 >= 0 && next0 < N && next1 >= 0 && next1 < N) {
                    if(arr[next0][next1] == 1) {
                        arr[next0][next1] = 2;
                        queue.offer(new int[] {next0, next1});
                    }
                }
            }
        }
    }

    public static int solution() {
        int answer = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(arr[i][j] == 1) {
                    answer++;
                    BFS(i,j);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution());
    }

}

