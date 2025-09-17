package DfsBfs.rev;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main12RRRRRRRRRRR {
    // 토마토(BFS 활용)
    public static Integer BFS(int n, int m, int[][] arr, Queue<int[]> queue) {
        int[] DI = {-1,0,0,1};
        int[] DJ = {0,-1,1,0};

        int answer = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int[] temp = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int next0 = temp[0] + DI[j];
                    int next1 = temp[1] + DJ[j];

                    if(next0 >= 0 && next0 < n && next1 >= 0 && next1 < m) {
                        if(arr[next0][next1] == 0) {
                            arr[next0][next1] = 1;
                            queue.offer(new int[] {next0, next1});
                        }
                    }
                }
            }
            answer++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 0) {
                    answer = 0;
                    break;
                }
            }
        }

        return answer-1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] arr = new int[n][m];

        Queue<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();

                if(arr[i][j] == 1) {
                    queue.offer(new int[] {i,j});
                }
            }
        }

        if(queue.size() == m*n) {
            System.out.println(0);
        } else {
            System.out.println(BFS(n,m,arr,queue));
        }
    }

}
