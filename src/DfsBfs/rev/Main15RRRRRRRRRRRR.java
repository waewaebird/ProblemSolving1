package DfsBfs.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main15RRRRRRRRRRRR {
    // 피자 배달 거리
    static int N;
    static int M;
    static int[][] arr;
    static List<int[]> pizza = new ArrayList<>();
    static int[] combi;
    static int answer = Integer.MAX_VALUE;

    public static void DFS(int v, int start) {
        if(v == M) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(arr[i][j] == 1) {
                        int dist = Integer.MAX_VALUE;

                        for(int x : combi) {
                            int now1 = pizza.get(x)[0];
                            int now2 = pizza.get(x)[1];

                            dist = Math.min(dist, Math.abs(i - now1) + Math.abs(j - now2));
                        }

                        sum += dist;
                    }
                }
            }

            answer = Math.min(answer, sum);
        } else {
            for (int i = start; i < pizza.size(); i++) {
                combi[v] = i;
                DFS(v+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();

        arr = new int[N][N];
        combi = new int[M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = in.nextInt();
                if(arr[i][j] == 2) {
                    pizza.add(new int[] {i,j});
                }
            }
        }

        DFS(0,0);
        System.out.println(answer);
    }

}
