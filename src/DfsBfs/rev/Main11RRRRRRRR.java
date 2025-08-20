package DfsBfs.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main11RRRRRRRR {
    // 미로의 최단거리 통로
    static int[][] arr = new int[7][7];
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};
    static int answer = 0;

    public static void BFS(int v1, int v2) {
        Deque<int[]> queue = new ArrayDeque<>();

        arr[v1][v2] = 1;
        queue.offer(new int[] {v1, v2});

        boolean isBreak = false;

        while(!queue.isEmpty()) {
            if(isBreak) {
                break;
            }

            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int[] temp = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int n1 = temp[0] + DI[j];
                    int n2 = temp[1] + DJ[j];

                    if(n1 == 6 && n2 == 6) {
                        isBreak = true;
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

            answer++;
        }

        if(!isBreak) {
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
