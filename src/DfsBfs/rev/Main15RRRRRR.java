package DfsBfs.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main15RRRRRR {
    // 피자 배달 거리
    static int N;
    static int M;
    static int[][] maps;
    static int[] combi;
    static List<int[]> pizzas = new ArrayList<>();
    static int answer = Integer.MAX_VALUE;

    public static void DFS(int v, int start) {
        if(v == M) {
            for(int x : combi) {
                // 조합이 넘어옴
                int sum = 0;
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if(maps[i][j] == 1) {
                            int dist = Integer.MAX_VALUE;

                            for(Integer key : combi) {
                                int temp1 = pizzas.get(key)[0];
                                int temp2 = pizzas.get(key)[1];

                                dist = Math.min(dist, Math.abs(i - temp1) + Math.abs(j - temp2));
                            }

                            sum += dist;
                        }
                    }
                }

                answer = Math.min(sum, answer);
            }
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
