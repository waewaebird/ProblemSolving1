package DfsBfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main12 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer = 0;

    public static void BFS(int m, int n, int[][] arr) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 1) {
                    queue.add(new int[] {i,j});
                }
            }
        }

        while(!queue.isEmpty()) {
            answer++;
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int[] temp = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = temp[0] + dx[j];
                    int ny = temp[1] + dy[j];

                    if(nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0) {
                        arr[nx][ny] = 1;
                        queue.offer(new int[] {nx, ny});
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        BFS(m, n, arr);

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 0) {
                    flag = false;
                    break;
                }
            }
        }

        if(flag == false) {
            System.out.println(-1);
        } else {
            System.out.println(answer-1);
        }





    }
}
