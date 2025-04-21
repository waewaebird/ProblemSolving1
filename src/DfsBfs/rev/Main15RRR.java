package DfsBfs.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main15RRR {
    //피자배달거리
    static int N;
    static int M;
    static int[][] arr;
    static List<Pizzas> list;
    static Pizzas[] combi;
    static int answer = Integer.MAX_VALUE;
    static class Pizzas {
        int I;
        int J;
        public Pizzas(int i, int j) {
            I = i;
            J = j;
        }
    }

    public static void DFS(int v, int start) {
        if(v == M) {
            // 해당 조합의 피자집과 각 집마다의 거리를 찾음
            int sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(arr[i][j] == 1) {
                        int dis = Integer.MAX_VALUE;
                        for(Pizzas x : combi) {
                            dis = Math.min(Math.abs(x.I - i) + Math.abs(x.J - j), dis);
                        }
                        sum += dis;
                    }
                }
            }
            answer = Math.min(answer,sum);
        } else {
            for (int i = start; i < list.size(); i++) {
                combi[v] = list.get(i);
                DFS(v+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();

        arr = new int[N][N];

        list = new ArrayList<>();

        combi = new Pizzas[M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = in.nextInt();

                if(arr[i][j] == 2) {
                    list.add(new Pizzas(i,j));
                }
            }
        }

        DFS(0,0);

        System.out.println(answer);
    }
}
