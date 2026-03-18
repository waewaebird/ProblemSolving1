package DfsBfs.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main15RRRRRRRRRRRRR {
    // 피자 배달 거리

    static int N;
    static int M;
    static int[][] arr;

    static List<int[]> pizzas = new ArrayList<>();
    static int[] pm;

    static int answer = Integer.MAX_VALUE;

    public static void DFS(int v, int start) {
        if(v == M) {
            int total = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(arr[i][j] == 1) {
                        int dist = Integer.MAX_VALUE;

                        for(int x : pm) {
                            int[] now = pizzas.get(x);

                            dist = Math.min(dist, Math.abs(i - now[0]) + Math.abs(j - now[1]));
                        }

                        total += dist;
                    }
                }
            }

            answer = Math.min(answer, total);
        } else {
            for (int i = start; i < pizzas.size(); i++) {
                pm[v] = i;
                DFS(v+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        arr = new int[N][N];
        pm = new int[M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = in.nextInt();

                if(arr[i][j] == 2) {
                    pizzas.add(new int[] {i,j});
                }
            }
        }

        DFS(0,0);

        System.out.println(answer);
    }
}
