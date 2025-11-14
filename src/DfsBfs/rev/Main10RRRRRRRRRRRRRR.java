package DfsBfs.rev;

import java.util.Scanner;

public class Main10RRRRRRRRRRRRRR {
    // 미로탐색
    static int[][] arr = new int[7][7];
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};
    static int answer = 0;

    public static void DFS(int a, int b) {
        if(a == 6 && b == 6) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int na = a + DI[i];
                int nb = b + DJ[i];

                if(na >= 0 && na < 7 && nb >= 0 && nb < 7) {
                    if(arr[na][nb] == 0) {
                        arr[na][nb] = 1;
                        DFS(na, nb);
                        arr[na][nb] = 0;
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
