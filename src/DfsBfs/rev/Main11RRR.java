package DfsBfs.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main11RRR {
    // 미로의 최단거리 통로
    static int[][] arr = new int[7][7];
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1, 1, 0};

    public static int BFS(int s, int e) {
        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[] {s,e});

        arr[s][e] = 1;

        int answer = 0;
        boolean flag = false;

        while(!queue.isEmpty()) {
            if(flag) {
                break;
            }

            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int[] temp = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int na = temp[0] + DI[j];
                    int nb = temp[1] + DJ[j];

                    if(na == 6 && nb == 6) {
                        flag = true;
                        break;
                    }

                    if(na >= 0 && na < 7 && nb >= 0 && nb < 7) {
                        if(arr[na][nb] == 0) {
                            queue.offer(new int[] {na,nb});
                            arr[na][nb] = 1;
                        }
                    }
                }
            }
            answer++;
        }

        if(!flag) {
            answer = -1;
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
