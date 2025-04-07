package DfsBfs.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main13R {
    
    //섬나라아일랜드
    static int n;
    static int[][] map;
    static int[] dx = {-1,0,1,-1,1,-1,0,1};
    static int[] dy = {-1,-1,-1,0,0,1,1,1};

    public static int BFS() {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if(map[i][j] == 1) {
                    queue.offer(new int[] {i,j});
                    map[i][j] = 99;
                    while(!queue.isEmpty()) {
                        int[] temp = queue.poll();

                        for (int k = 0; k < 8; k++) {
                            int a = temp[0] + dx[k];
                            int b = temp[1] + dy[k];
                            if(a >= 0 && a < n && b >= 0 && b < n) {
                                if(map[a][b] == 1) {


                                    queue.offer(new int[] {a, b});
                                    map[a][b] = 99;
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

        n = in.nextInt();

        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = in.nextInt();
            }
        }

        System.out.println(BFS());
    }
}
