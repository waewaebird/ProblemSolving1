package DfsBfs.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main15RRRRR {
    // 피자 배달 거리
    static int N;
    static int M;
    static int[][] map;
    static List<int[]> list = new ArrayList<>();
    static int[] combi;
    static int answer = Integer.MAX_VALUE;

    public static void DFS(int v, int start) {
        if(v == M) {
            int ta = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(map[i][j] == 1) {
                        int nowDist = Integer.MAX_VALUE;

                        for(int x : combi) {
                            int temp1 = list.get(x)[0];
                            int temp2 = list.get(x)[1];
                            nowDist = Math.min(nowDist, Math.abs(temp1 - i) + Math.abs(temp2 - j));
                        }

                        ta += nowDist;
                    }
                }
            }
            answer = Math.min(answer, ta);
        } else {
            for (int i = start; i < list.size(); i++) {
                combi[v] = i;
                DFS(v+1, i+1);
            }
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        map = new int[N][N];

        combi = new int[M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = in.nextInt();
                if(map[i][j] == 2) {
                    list.add(new int[] {i,j});
                }
            }
        }

        DFS(0,0);

        System.out.println(answer);
    }
}

