package DfsBfs.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main11RR {
    // 미로의 최단거리 통로
    static int[][] arr = new int[7][7];
    static int[][] ch = new int[7][7];
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};
    static int answer = 0;

    public static void BFS(int ii, int jj) {
        boolean flag = false;

        Queue<int[]> queue = new LinkedList<>();
        ch[ii][jj] =1;
        queue.offer(new int[] {ii,jj});
        int level = 0;
        while(!queue.isEmpty()) {
            if(flag) {
                break;
            }

            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int[] temp = queue.poll();

                for (int k = 0; k < 4; k++) {
                    int ni = temp[0] + DI[k];
                    int nj = temp[1] + DJ[k];

                    if(ni >= 0 && ni < 7 && nj >= 0 && nj < 7) {
                        if(arr[ni][nj] == 0 && ch[ni][nj] == 0) {
                            if(ni == 6 && nj == 6){
                                flag = true;
                                break;
                            }
                            queue.offer(new int[] {ni, nj});
                            ch[ni][nj] = 1;
                        }
                    }
                }
                if(flag) {
                    break;
                }
            }
            level++;
        }
        if(flag) {
            answer = level;
        } else {
            answer = -1;
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        BFS(0,0);
        System.out.println(answer);
    }
}
