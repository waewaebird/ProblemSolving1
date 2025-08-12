package DfsBfs.rev;

import java.util.Scanner;

public class Main13RRRRRR {
    // 섬나라 아일랜드
    static int N;
    static int[][] arr;
    static int[] DI = {-1,-1,-1,0,0,1,1,1};
    static int[] DJ = {-1,0,1,-1,1,-1,0,1};

    public static void DFS(int v1, int v2) {
        if(v1 == N && v2 == N) {
            return;
        } else {
            for (int k = 0; k < 8; k++) {
                int ni = v1 + DI[k];
                int nj = v2 + DJ[k];

                if(ni >= 0 && ni < N && nj >= 0 && nj < N) {
                    if(arr[ni][nj] == 1) {
                        arr[ni][nj] = 2;
                        DFS(ni, nj);
                    }
                }
            }

        }
    }

    public static Integer solution() {
        int answer = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(arr[i][j] == 1) {
                    arr[i][j] = 2;
                    DFS(i,j);
                    answer++;
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
