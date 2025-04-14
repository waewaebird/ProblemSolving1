package DfsBfs.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main13RR {
    //섬나라 아일랜드
    static int N;
    static int[][] graph;
    static int[] dI = {-1,-1,-1,0,0,1,1,1};
    static int[] dJ = {-1,0,1,-1,1,-1,0,1};
    static int[][] ch;
    static int answer = 0;

    public static void solution() {
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(graph[i][j] == 1 && ch[i][j] == 0) {
                    answer++;
                    queue.offer(new int[] {i,j});
                    ch[i][j] = 1;

                    while(!queue.isEmpty()) {
                        int[] temp = queue.poll();

                        for (int k = 0; k < 8; k++) {
                            int nI = temp[0] + dI[k];
                            int nJ = temp[1] + dJ[k];

                            if(nI >= 0 && nI < N && nJ >= 0 && nJ < N) {
                                if(graph[nI][nJ] == 1 && ch[nI][nJ] == 0) {
                                    queue.offer(new int[] {nI, nJ});
                                    ch[nI][nJ] = 1;
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();

        graph = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = in.nextInt();
            }
        }
        ch = new int[N][N];

        solution();

        System.out.println(answer);

    }
}
