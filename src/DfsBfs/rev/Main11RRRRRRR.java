package DfsBfs.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main11RRRRRRR {
    // 미로의 최단거리 통로(BFS)
    static int[][] arr = new int[7][7];
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};

    public static Integer BFS(int v1, int v2) {
        Deque<int[]> queue = new ArrayDeque<>();
        arr[v1][v2] = 1;
        queue.offer(new int[] {v1,v2});

        boolean flag = false;

        int level = 0;
        while(!queue.isEmpty()) {
            if(flag) {
                break;
            }

            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int[] current = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int t1 = current[0] + DI[j];
                    int t2 = current[1] + DJ[j];

                    if(t1 >= 0 && t1 < 7 && t2 >= 0 && t2 < 7) {

                        if(t1 == 6 && t2 == 6) {
                            flag = true;
                            break;
                        }

                        if(arr[t1][t2] == 0) {
                            queue.offer(new int[] {t1,t2});
                            arr[t1][t2] = 1;
                        }
                    }
                }
            }
            level++;
        }

        if(!flag) {
            return -1;
        } else {
            return level;
        }
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
