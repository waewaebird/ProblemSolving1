package DfsBfs.rev;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main11RRRRRRRRRR {
    // 미로의 최단거리 통로
    public static int BFS(int[][] arr, int v1, int v2) {
        int answer = -1;

        int[] DI = {-1,0,0,1};
        int[] DJ = {0,-1,1,0};

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {v1,v2});

        int level = 0;
        while(!queue.isEmpty()) {
            if(answer > 0) {
                break;
            }
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                if(answer > 0) {
                    break;
                }
                int[] current = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int n1 = current[0] + DI[j];
                    int n2 = current[1] + DJ[j];

                    if(n1 == 6 &&  n2 == 6) {
                        answer = level+1;
                        break;
                    }

                    if(n1 >= 0 && n1 < 7 && n2 >= 0 && n2 < 7) {
                        if(arr[n1][n2] == 0) {
                            arr[n1][n2] = 1;
                            queue.offer(new int[] {n1,n2});
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
        int[][] arr = new int[7][7];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        arr[0][0] = 1;
        System.out.println(BFS(arr,0,0));
    }
}
