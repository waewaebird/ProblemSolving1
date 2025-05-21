package DfsBfs.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main11RRRR {
    // 미로의 최단거리 통로
    static int[][] arr = new int[7][7];
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};

    public static int BFS(int s, int e){
        boolean flag =false;
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[] {s,e});
        arr[s][e] = 1;

        int level = 0;
        while (!queue.isEmpty()) {
            if(flag) {
                break;
            }
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int[] temp = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int ni = temp[0] + DI[j];
                    int nj = temp[1] + DJ[j];

                    if(ni == 6 && nj == 6) {
                        flag = true;
                        break;
                    }

                    if(ni >= 0 && ni < 7 && nj >= 0 && nj < 7) {
                        if(arr[ni][nj] == 0) {
                            queue.offer(new int[] {ni,nj});
                            arr[ni][nj] = 1;
                        }
                    }
                }
            }
            level++;
        }

        if(!flag) {
            level = -1;
        }
        return level;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(BFS(0,0));
    }

}
