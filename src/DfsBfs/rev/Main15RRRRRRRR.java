package DfsBfs.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main15RRRRRRRR {
    // 피자 배달 거리(삼성 SW역량평가 기출문제 : DFS활용)
    static int N;
    static int M;
    static int[][] maps;
    static List<int[]> pizzas = new ArrayList<>();
    static int[] combi;
    static int answer = Integer.MAX_VALUE;

    public static void DFS(int v, int start) {
        if(v == M) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(maps[i][j] == 1) {
                        int dist = Integer.MAX_VALUE;
                        for(int x : combi) {
                            int d1 = pizzas.get(x)[0];
                            int d2 = pizzas.get(x)[1];
                            dist = Math.min(dist, Math.abs(i - d1) + Math.abs(j - d2));
                        }
                        sum += dist;
                    }
                }
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = start; i < pizzas.size(); i++) {
                combi[v] = i;
                DFS(v+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        combi = new int[M];

        maps = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                maps[i][j] = in.nextInt();

                if(maps[i][j] == 2) {
                    pizzas.add(new int[] {i,j});
                }
            }
        }

        DFS(0,0);
        System.out.println(answer);
    }
}
