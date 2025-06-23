package DfsBfs.rev;

import java.util.Scanner;

public class Main10RRRRRR {
    // 미로탐색
    static int[][] arr= new int[7][7];
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};
    static int answer = 0;

    public static void DFS(int v1, int v2) {
        if(v1 == 6 && v2 == 6) {
            answer++;
        }

        for (int i = 0; i < 4; i++) {
            int n1 = v1 + DI[i];
            int n2 = v2 + DJ[i];

            if(n1 >= 0 && n1 < 7 && n2 >= 0 && n2 <7) {
                if(arr[n1][n2] == 0) {
                    arr[n1][n2] = 1;
                    DFS(n1,n2);
                    arr[n1][n2] = 0;
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
