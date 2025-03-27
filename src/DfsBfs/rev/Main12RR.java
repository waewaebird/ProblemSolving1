package DfsBfs.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main12RR {
    static int m;
    static int n;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {-1,0,1,0};

    public static int BFS(int[][] box) {
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(box[i][j] == 1) {
                    queue.offer(new int[] {i,j});
                }
            }
        }

        System.out.println(queue);

        int answer = 0;
        while(!queue.isEmpty()) {
            int[] temp = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = temp[0]+ dx[i];
                int nextY = temp[1]+ dy[i];

                if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && box[nextX][nextY] == 0) {
                    queue.offer(new int[] {nextX, nextY});
                }
            }
            answer++;
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        m = in.nextInt();
        n = in.nextInt();

        int[][] box = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                box[i][j] = in.nextInt();
            }
        }

        System.out.println(BFS(box));

    }
}
