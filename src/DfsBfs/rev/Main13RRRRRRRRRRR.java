package DfsBfs.rev;

import java.util.Scanner;

public class Main13RRRRRRRRRRR {
    // 섬나라 아일랜드
    static int n;
    static int[][] arr;
    static int[] DI = {-1,-1,-1,0,0,1,1,1};
    static int[] DJ = {-1,0,1,-1,1,-1,0,1};

    public static void DFS(int a, int b) {
        arr[a][b] = 0;
        for (int i = 0; i < 8; i++) {
            int ni = a + DI[i];
            int nj = b + DJ[i];

            if(ni >= 0 && ni < n && nj >= 0 && nj < n) {
                if(arr[ni][nj] == 1) {
                    DFS(ni,nj);
                }
            }
        }
    }

    public static int solution() {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
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

        n = in.nextInt();
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution());
    }
}
