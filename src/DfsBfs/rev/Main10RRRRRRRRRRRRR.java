package DfsBfs.rev;

import java.util.Scanner;

public class Main10RRRRRRRRRRRRR {
    // 미로탐색
    static int[][] arr = new int[7][7];
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};
    static int answer = 0;

    public static void DFS(int v1, int v2) {
        if(v1 == 6 && v2 ==6) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nv1 = v1 + DI[i];
                int nv2 = v2 + DJ[i];

                if(nv1 >= 0 && nv1 < 7 && nv2 >= 0 && nv2 < 7){
                    if(arr[nv1][nv2] == 0) {
                        arr[nv1][nv2] = 1;
                        DFS(nv1, nv2);
                        arr[nv1][nv2] = 0;
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
