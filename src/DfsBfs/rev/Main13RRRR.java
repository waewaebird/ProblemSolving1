package DfsBfs.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main13RRRR {
    // 섬나라 아일랜드
    static int N;
    static int[][] arr;
    static int[][] ch;
    static int[] DI = {-1,-1,-1,0,0,1,1,1};
    static int[] DJ = {-1,0,1,-1,1,-1,0,1};

    public static int solution() {
        int answer = 0;

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if(arr[i][j] == 1 && ch[i][j] == 0) {
                    queue.offer(new int[] {i,j});
                    ch[i][j] = 1;

                    while(!queue.isEmpty()) {
                        int[] temp = queue.poll();

                        for (int k = 0; k < 8; k++) {
                            int ti = temp[0] + DI[k];
                            int tj = temp[1] + DJ[k];

                            if(ti >= 0 && ti < N && tj >= 0 && tj < N) {
                                if(arr[ti][tj] == 1 && ch[ti][tj] == 0) {
                                    queue.offer(new int[] {ti,tj});
                                    ch[ti][tj] = 1;
                                }
                            }

                        }
                    }
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        arr = new int[N][N];
        ch = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution());
    }
}
