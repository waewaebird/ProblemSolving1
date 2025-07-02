package DfsBfs.rev;

import java.util.Scanner;

public class Main10RRRRRRR {
    // 미로탐색
    static int[][] arr = new int[7][7];
    static int answer = 0;
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};

    public static void DFS(int v1, int v2) {
        if(v1 == 6 && v2 == 6) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nowI = v1 + DI[i];
                int nowJ = v2 + DJ[i];

                if(nowI >= 0 && nowI < 7 && nowJ >= 0 && nowJ < 7) {
                    if(arr[nowI][nowJ] == 0) {
                        arr[nowI][nowJ] = 1;
                        DFS(nowI, nowJ);
                        arr[nowI][nowJ] = 0;
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

