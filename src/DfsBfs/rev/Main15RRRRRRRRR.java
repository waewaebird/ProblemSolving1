package DfsBfs.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main15RRRRRRRRR {
    // 피자 배달 거리
    static int N;
    static int C;
    static int[][] arr;
    static List<int[]> pizzas = new ArrayList<>();
    static int[] combi;
    static int answer = Integer.MAX_VALUE;

    public static void DFS(int v, int start){
        if(v == C) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(arr[i][j] == 1) {
                        int dist = Integer.MAX_VALUE;
                        for(int x : combi) {
                            int ni = Math.abs(i - pizzas.get(x)[0]);
                            int nj = Math.abs(j - pizzas.get(x)[1]);

                            dist = Math.min(dist, ni + nj);
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
        C = in.nextInt();

        arr = new int[N][N];

        combi = new int[C];

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
