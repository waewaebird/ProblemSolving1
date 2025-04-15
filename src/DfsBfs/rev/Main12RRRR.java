package DfsBfs.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main12RRRR {
    //토마토
    public static int BFS(int n, int m, int[][] box) {
        int[] dN = {-1,0,0,1};
        int[] dM = {0,-1,1,0};

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(box[i][j] == 1) {
                    queue.offer(new int[] {i,j});
                }
            }
        }

        int level = 0;
        while(!queue.isEmpty()) {
            boolean flag = false;
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int[] temp = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int nextN = temp[0] + dN[j];
                    int nextM = temp[1] + dM[j];

                    if(nextN >= 0 && nextN < n && nextM >= 0 && nextM < m) {
                        if(box[nextN][nextM] == 0) {
                            queue.offer(new int[] {nextN,nextM});
                            box[nextN][nextM] = 1;
                            flag = true;
                        }
                    }
                }
            }

            if(flag) {
                level++;
            }
        }

        return level;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        int[][] box = new int[n][m];

        int all = n*m;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                box[i][j] = in.nextInt();
                if(box[i][j] == 1) {
                    temp++;
                }
            }
        }

        int answer = 0;
        if(all == temp) {
            answer = 0;
        } else {
            answer = BFS(n,m,box);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(box[i][j] == 0) {
                        answer = -1;
                        break;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
