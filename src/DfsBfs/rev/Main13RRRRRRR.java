package DfsBfs.rev;

import java.util.Scanner;

public class Main13RRRRRRR {
    // 섬나라 아일랜드
    static int N;
    static int[][] arr;
    static int[] DI = {-1,-1,-1,0,0,1,1,1};
    static int[] DJ = {-1,0,1,-1,1,-1,0,1};

    public static void DFS(int v1, int v2) {
        for (int i = 0; i < 8; i++) {
            int nv1 = v1 + DI[i];
            int nv2 = v2 + DJ[i];

            if(nv1 >= 0 && nv1 < N && nv2 >= 0 && nv2 < N){
                if(arr[nv1][nv2] == 1) {
                    arr[nv1][nv2] = 2;
                    DFS(nv1, nv2);
                }
            }
        }
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

        System.out.println(answer);
    }

}
