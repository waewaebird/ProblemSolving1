package DfsBfs.rev;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main11RRRRRRRRR {
    // 미로의 최단거리 통로
    static int[][] arr = new int[7][7];
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};
    static int answer = Integer.MAX_VALUE;

    public static int BFS(int x, int y){
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {x,y});
        arr[x][y] = 1;

        int answer = -1;
        int level = 0;
        while(!queue.isEmpty()) {
            if(answer != -1) {
                break;
            }
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int[] temp = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nx = temp[0] + DI[j];
                    int ny = temp[1] + DJ[j];

                    if(nx == 6 && ny == 6) {
                       answer = level + 1;
                       break;
                    }

                    if(nx >= 0 && nx < 7 && ny >= 0 && ny < 7) {
                        if(arr[nx][ny] == 0) {
                            arr[nx][ny] = 1;
                            queue.offer(new int[] {nx,ny});
                        }
                    }
                }
            }
            level++;
        }

        return answer;
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
