package DfsBfs.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main15RR {
    //피자 배달 거리
    static int N;
    static int M;
    static int[][] graph;
    static Pizza[] combi;
    static List<Pizza> list = new ArrayList<>();
    static int answer = Integer.MAX_VALUE;
    static class Pizza {
        int ii;
        int jj;

        public Pizza(int ii, int jj) {
            this.ii = ii;
            this.jj = jj;
        }
    }

    public static void DFS(int v, int start) {
        if(v == M) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(graph[i][j] == 1) {
                        int dis = Integer.MAX_VALUE;
                        for(Pizza temp : combi) {
                            dis = Math.min(Math.abs(i-temp.ii) + Math.abs(j-temp.jj), dis);
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

        graph = new int[N][N];

        M = in.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = in.nextInt();

                if(graph[i][j] == 2) {
                    list.add(new Pizza(i,j));
                }
            }
        }

        combi = new Pizza[M];
        DFS(0,0);

        System.out.println(answer);
        /*for(Pizza temp : list) {
            System.out.println(temp.ii + " " + temp.jj);
        }*/


    }
}
