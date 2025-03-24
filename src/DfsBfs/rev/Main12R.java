package DfsBfs.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main12R {

    static int[] dx = {0,1,0,-1};
    static int[] dy = {-1,0,1,0};

    public static int BFS(int m, int n, int[][] arr) {
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 1) {
                    queue.offer(new int[] {i,j});
                }
            }
        }

        int level = 0;
        while(!queue.isEmpty()) {

            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int[] temp = queue.poll();
                int a = temp[0];
                int b = temp[1];

                for (int j = 0; j < 4; j++) {
                    int nx = a + dx[j];
                    int ny = b + dy[j];

                    if(nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0) {
                        arr[nx][ny] = 1;
                        queue.offer(new int[] {nx,ny});
                    }
                }
            }

            level++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 0) {
                    return -1;
                }
            }
        }

        return level-1;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(BFS(m,n,arr));

    }
}
