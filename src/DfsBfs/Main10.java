package DfsBfs;

import java.util.Scanner;

/*
0 0 0 0 0 0 0
0 1 1 1 1 1 0
0 0 0 1 0 0 0
1 1 0 1 0 1 1
1 1 0 0 0 0 1
1 1 0 1 1 0 0
1 0 0 0 0 0 0
*/


/*
1 2 3 9 5 6 7
9 1 2 3 7 5 6
7 8 9 1 2 3 2
1 1 0 1 0 1 1
1 1 0 0 0 0 1
1 1 0 1 1 0 0
1 0 0 0 0 0 0
*/


/*
0 0
0 0
 */



public class Main10 {
    static int[][] arr;
    static int[][] ch;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {-1,0,1,0};
    static int answer = 0;

    public static void DFS(int x, int y) {
        if(x == 6 && y == 6) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int tempx = x+dx[i];
                int tempy = y+dy[i];
                if(tempx >= 0 && tempx < 7 && tempy >= 0 && tempy < 7 && arr[tempx][tempy] == 0) {
                    arr[tempx][tempy] = 1;
                    DFS(tempx, tempy);
                    arr[tempx][tempy] = 0;

                    /*if(ch[tempx][tempy] == 0) {
                        ch[tempx][tempy] = 1;
                        DFS(tempx, tempy);
                        ch[tempx][tempy] = 0;
                    }*/
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        arr = new int[7][7];
        ch = new int[8][8];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        //System.out.println(arr[0][3]);

        arr[0][0] = 1;
        //ch[0][0] = 1;

        DFS(0,0);
        System.out.println(answer);
    }
}
