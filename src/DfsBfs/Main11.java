package DfsBfs;

import java.util.LinkedList;
import java.util.Queue;
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


public class Main11 {
    static int[][] arr;
    static int[][] ch;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {-1,0,1,0};

    public static int BFS(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});

        int level = 1;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int j = 0; j < len; j++) {
                int temp[] = queue.poll();

                for (int i = 0; i < 4; i++) {
                    int tempx = temp[0] + dx[i];
                    int tempy = temp[1] + dy[i];

                    if(tempx == 6 && tempy == 6) {
                        return level;
                    }

                    if(tempx >= 0 && tempx < 7 && tempy >= 0 && tempy < 7 && arr[tempx][tempy] == 0) {
                        if(ch[tempx][tempy] == 0) {
                            ch[tempx][tempy] = 1;
                            queue.offer(new int[]{tempx, tempy});
                        }
                    }
                }
            }
            level++;
        }
        return -1;
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

        ch[0][0] = 1;
        System.out.println(BFS(0,0));
    }
}
