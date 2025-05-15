package DfsBfs.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main13RRRRR {
    //섬나라 아일랜드
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
                if(arr[i][j] == 1 && ch[i][j] ==0) {
                    queue.offer(new int[] {i, j});

                    while(!queue.isEmpty()) {
                        int[] temp = queue.poll();

                        for (int k = 0; k < 8; k++) {
                            int nextI = temp[0] + DI[k];
                            int nextJ = temp[1] + DJ[k];

                            if(nextI >= 0 && nextI < N && nextJ >= 0 && nextJ < N) {
                                if(arr[nextI][nextJ] == 1 && ch[nextI][nextJ] == 0) {
                                    queue.offer(new int[] {nextI, nextJ});
                                    ch[nextI][nextJ] = 1;
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
