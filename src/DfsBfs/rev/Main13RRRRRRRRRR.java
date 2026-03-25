package DfsBfs.rev;

import java.util.Scanner;

public class Main13RRRRRRRRRR {
    // 섬나라 아일랜드
    static int N;
    static int[][] arr;
    static int[] DI = {-1,-1,-1,0,0,1,1,1};
    static int[] DJ = {-1,0,1,-1,1,-1,0,1};

    public static void DFS(int x, int y) {
        arr[x][y] = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + DI[i];
            int ny = y + DJ[i];

            if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if(arr[nx][ny] == 1) {
                    DFS(nx,ny);
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
                    DFS(i,j);
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
