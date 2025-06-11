package DfsBfs.rev;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main11RRRRR {
    // 미로의 최단거리 통로
    static int[][] arr = new int[7][7];
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};

    public static int BFS(int v1, int v2) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {v1, v2});

        boolean flag = false;

        arr[0][0] = 1;
        int level = 0;

        while(!queue.isEmpty()) {
            if(flag) {
                break;
            }

            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int[] temp = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int n0 = temp[0] + DI[j];
                    int n1 = temp[1] + DJ[j];

                    if(n0 == 6 && n1 == 6) {
                        flag = true;
                        break;
                    }

                    if(n0 >= 0 && n0 < 7 && n1 >= 0 && n1 < 7) {
                        if(arr[n0][n1] == 0) {
                            queue.offer(new int[] {n0,n1});
                            arr[n0][n1] = 1;
                        }
                    }
                }
            }
            level++;
        }

        if(flag == false) {
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
