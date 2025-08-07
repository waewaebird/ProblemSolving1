package DfsBfs.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main15RRRRRRR {
    // 피자 배달 거리(삼성 SW역량평가 기출문제 : DFS활용)
    static int N;
    static int M;
    static int[][] arr;
    static List<int[]> pizzas = new ArrayList<>();
    static List<Integer>[] combi;
    static int answer = Integer.MAX_VALUE;

    public static void DFS(int v, int start) {
        if(v == M) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(arr[i][j] == 1) {
                        int value = Integer.MAX_VALUE;
                        for(List<Integer> x : combi) {
                            value = Math.min(value, Math.abs(i - x.get(0)) + Math.abs(j - x.get(1)));
                        }
                        sum += value;
                    }
                }
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = start; i < pizzas.size(); i++) {
                int[] temp = pizzas.get(i);
                List<Integer> temps = new ArrayList<>();
                temps.add(temp[0]);
                temps.add(temp[1]);
                combi[v] = temps;
                DFS(v+1, i+1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();
        arr = new int[N][N];

        combi = new List[M];

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
