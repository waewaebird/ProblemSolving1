package DfsBfs.rev;

import java.util.Scanner;

public class Main10RRRRRRRRRRR {
    // 미로탐색
    static int[][] arr = new int[7][7];
    static int answer = 0;
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};

    public static void DFS(int v1, int v2) {
        if(v1 == 6 && v2 == 6){
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int ni = v1 + DI[i];
                int nj = v2 + DJ[i];

                if(ni >= 0 && ni < 7 && nj >= 0 && nj < 7) {
                    if(arr[ni][nj] == 0) {
                        arr[ni][nj] = 1;
                        DFS(ni,nj);
                        arr[ni][nj] = 0;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        arr[0][0] = 1;
        DFS(0,0);

        System.out.println(answer);
    }
}
