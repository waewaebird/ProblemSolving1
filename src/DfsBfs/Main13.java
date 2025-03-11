package DfsBfs;

import java.util.*;

public class Main13 {
    static int n;
    static int[][] arr;
    static int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int[] dy = {-1, -1, -1 , 0, 0, 1, 1, 1};
    static int[][] ch;
    static int island = 0;

    public static void CDFS(int x, int y) {
        if(x == n-1 && y == n-1) {
            return;
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < 8; k++) {
                        int nx = x + dx[k];
                        int ny = y + dy[k];

                        if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 1) {
                            if(ch[nx][ny] == 0) {
                                ch[nx][ny] = 33;
                                CDFS(nx, ny);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void DFS(int x, int y) {
        if(x == n-1 && y == n-1) {
            return;
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(arr[i][j] == 1 && ch[i][j] != 33) {
                        island++;
                        CDFS(i,j);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        ch = new int[n][n];

        ch[0][0] = 33;
        DFS(0,0);

        System.out.println(island);
    }
}
