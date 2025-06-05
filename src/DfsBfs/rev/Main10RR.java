package DfsBfs.rev;

import java.util.Scanner;

public class Main10RR {
    // 미로탐색(DFS)
    static int[][] arr = new int[7][7];
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};
    static int answer = 0;

    public static void DFS(int v1, int v2) {
        if(v1 == 6 && v2 == 6) {
            answer++;
            return;
        }

        for (int k = 0; k < 4; k++) {
            int t1 = v1 + DI[k];
            int t2 = v2 + DJ[k];

            if(t1 >= 0 && t1 < 7 && t2 >= 0 && t2 < 7) {
                if(arr[t1][t2] == 0) {
                    arr[t1][t2] = 1;
                    DFS(t1,t2);
                    arr[t1][t2] = 0;
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
